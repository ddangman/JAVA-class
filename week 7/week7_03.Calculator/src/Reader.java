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
public class Reader {
    private final Scanner reader = new Scanner(System.in);
    
    public String readString() {
        String x = reader.nextLine();
        return x;
    }
    
    public int readInteger() {
        int value = Integer.parseInt(reader.nextLine());
        return value;
    }
    
}
 