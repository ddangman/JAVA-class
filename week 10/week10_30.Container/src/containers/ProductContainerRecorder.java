/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Dang
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory containerHist;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.containerHist = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }
    
    public String history() {
        return containerHist.toString();
    }
    
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        containerHist.add(this.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        double prev = this.getVolume();
        super.takeFromTheContainer(amount);
        containerHist.add(this.getVolume());
        return prev - this.getVolume();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + containerHist.toString());
        System.out.println("Greatest product amount: " + containerHist.maxValue());
        System.out.println("Smallest product amount: " + containerHist.minValue());
        System.out.println("Average: " + containerHist.average());
        System.out.println("Greatest change: " + containerHist.greatestFluctuation());
        System.out.println("Variance: " + containerHist.variance());
    }
    
}
