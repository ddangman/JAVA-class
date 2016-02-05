
public class NumberStatistics {

    private int amountOfNumbers;
    private int total = 0;

    public NumberStatistics() {
        int amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        total += number;

    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        int sum1 = 0;
        sum1 = sum1 + total;
        return sum1;
    }

    public double average() {
        double average = 0.0;
        if (amountOfNumbers == 0) {
            average = 0;
        } else {
            average = (double) total / amountOfNumbers();
        }
        return average;
    }
}
