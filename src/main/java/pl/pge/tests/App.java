package pl.pge.tests;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        runTask1();
    }

    static void runTask1(){
        InkPrinter inkPrinter = new InkPrinter();
        LaserPrinter laserPrinter = new LaserPrinter();

        inkPrinter.print("wydruk Ink");
        try{
            laserPrinter.print("wydruk Laser", 0);
        }
        catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        laserPrinter.print("tylko wydruk pojedyńczy");

        makeOrder(inkPrinter);
        //makeOrder(laserPrinter);
    }

    private static void makeOrder(SelfServiceable printer){
        printer.orderMterial();
    }

}
