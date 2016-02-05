/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Dang
 */
public class Analysis {
    private File file;
    public Analysis(File file) {
        this.file=file;
    }
    
    public int lines() {
        String content = readFile();
        return content.split("\n").length;
    }
    
    public String[] split() {
        String content = readFile();
        return content.split("e");
    }
    
     public int characters() {
        String content = readFile();
        return content.split("\n").length;
    }
    
    public String readFile() {
        String str = "";
        try {
          Scanner reader = new Scanner(file);  
            while (reader.hasNextLine()) {
                str += reader.nextLine();
                str +="\n";
            }            
        } catch (Exception e) {
            System.out.println("file not found");
        }
        return str;
    }

}
