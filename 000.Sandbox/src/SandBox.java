import java.io.File;
import java.util.*;

public class SandBox {

    public static void main(String[] args) {
        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        char[][] board = new char[5][3];
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 5; x++) {
                board[x][y] = 'o';
                sb.append(board[x][y]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
        
        
        
        
        //stay above this line
    }
    //add method below
    
    
    
}//keep method above
