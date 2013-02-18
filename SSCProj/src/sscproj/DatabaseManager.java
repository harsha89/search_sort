/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sscproj;

import java.io.IOException;

/**
 *
 * @author User
 */
public class DatabaseManager {
    DatabaseHandler dbHandler;
    BackupHandler backupHandler;
     Job job=new Job();
     String repository;
     String fileName;
     String user, pass;


    public DatabaseManager() {
        this.dbHandler = new DatabaseHandler(repository);
        this.backupHandler=new BackupHandler(user, pass);
    }

    public boolean putFile(Job job) throws IOException{
        dbHandler.setCurObj(job);
        dbHandler.putFile();
        return true;
    }

    public boolean getFile() throws IOException, ClassNotFoundException{
        dbHandler.getFile(fileName);
        return true;
    }

    public boolean updateFile (Job job) throws IOException{
        this.putFile(job);
        return true;
    }

    public boolean deleteFile() throws IOException{
        dbHandler.delete(fileName);
        return true;
    }

    public boolean backupFile(String fileName){
        if(backupHandler.login()){
            backupHandler.backup(fileName);
            return true;
        }
        else
            return false;

    }


}
