package pl.pge.tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class InkPrinterTest {

    @Test (expected = RuntimeException.class)
    public void print() {

        String text = "test";
        InkPrinter inkPrinter = new InkPrinter();
        inkPrinter.print(text);
        assertEquals(true, inkPrinter.text.equals(text));
    }

    @Test
    public void orderMterial() {
    }
}