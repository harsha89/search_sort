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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        Job job=new Job();
        job.no="456";
        DatabaseHandler ted = new DatabaseHandler("test");
        ted.putFile();
        System.out.println(ted.getFile("456").no);
       // ted.delete("1");
    }

}
