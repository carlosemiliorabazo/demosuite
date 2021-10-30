package es.ufv.dis.demosuite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {
    String message = "Carlos";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Dentro de testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}
