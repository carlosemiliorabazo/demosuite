package es.ufv.dis.demosuite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit2 {
    String message = "Rabazo";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Dentro de testSalutationMessage()");
        message = "Hi!" + "Rabazo";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
