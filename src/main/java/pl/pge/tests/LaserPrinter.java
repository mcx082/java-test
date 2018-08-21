package pl.pge.tests;

public class LaserPrinter extends Printer {

    @Override
    void print(String text) {
        System.out.println("print from LaserPrinter: " + text);
    }

    public void print(String text, int numberOfCopies) {
        if (numberOfCopies <= 0) {
            throw new RuntimeException("Erorr!! Number of pages can not be less than zero!");
        }
        System.out.printf("print from LaserPrinter: text:%s numberOfCopies: %d%n", text, numberOfCopies);
    }
}
