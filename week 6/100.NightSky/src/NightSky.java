
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        Random randomizer = new Random();
        for (int i = 0; i < width; i++) {
            double x = randomizer.nextDouble();
            if (x <= density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void print() {
        for (int i = 0; i < height; i++) {
            this.printLine();
            System.out.println("");
        }
    }

    public int starsInLastPrint() {
        int x = starsInLastPrint;
        starsInLastPrint=0;
        return x;
    }
    
}
