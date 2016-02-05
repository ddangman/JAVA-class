
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class Printer {
    private File file;
    private Scanner reader;
    
    public Printer(String fileName) throws FileNotFoundException {
        this.file = new File(fileName);
        
    }
    
    public void printLinesWhichContain(String word) throws Exception{
        this.reader = new Scanner(file);
        String line = "";
        while (reader.hasNextLine()) {
            line = reader.nextLine();
            if (word.isEmpty()) {               
                System.out.println(line);
            } 
            else if (line.contains(word)) {
                System.out.println(line);
            }            
        }
        reader.close();
    }
    
}
