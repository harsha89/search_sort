/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sscproj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author User
 */
public class DatabaseHandler {

    String repository;
    Job curObj;
    FileOutputStream fs;
     ObjectOutputStream os;
     FileInputStream fi;
     ObjectInputStream oi;

    public DatabaseHandler(String repository) {
        this.repository = repository;
        //this.curObj=curobj;
    }

    public Job getCurObj() {
        return curObj;
    }

    public void setCurObj(Job curObj) {
        this.curObj = curObj;
    }

    public void putFile() throws IOException{
        if(initConnection()){
            os.writeObject(curObj);
            //File dir=new File(repository);
            //dir.mkdir();
            endConnection();
        }

    }

    private boolean initConnection() throws IOException{

        fs=new FileOutputStream(curObj.no+".sscjob");
        os=new ObjectOutputStream(fs);


        return true;
    }

    private boolean endConnection() throws IOException{
        os.close();
        fs.close();
        return true;
    }

    public void delete(String job) throws IOException{
        File file= new File(job+".sscjob");
        file.delete();
    }

    public Job getFile(String job) throws IOException, ClassNotFoundException{

        fi=new FileInputStream(job+".sscjob");
        oi=new ObjectInputStream(fi);
        curObj=(Job)oi.readObject();
        return curObj;

    }



}
