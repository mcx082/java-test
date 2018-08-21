package pl.pge.tests;


import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class InkPrinter extends Printer implements SelfServiceable {

    String text;
    @Override
    void print(String text) {
        if (text.isEmpty()) throw new RuntimeException("Error!, text can nto be empty");
        this.text = text;
        System.out.println("print from InkPrinter: " + text);
    }

    @Override
    public void orderMterial() {
        System.out.println("order from InkPrinter interface");
    }
}
