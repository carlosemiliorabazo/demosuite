package es.ufv.dis.demosuite;

/*
 * Esta clase imprime por consola el mensaje que se le pasa
 */

public class MessageUtil {

    private String message;

    //Constructor
    //@param mensaje que debe ser impreso por consola
    public MessageUtil(String message){
        this.message = message;
    }

    // imprime el mensaje por consola y lo devuelve
    public String printMessage(){
        System.out.println(message);
        return message;
    }

    // añade "Hi!" al mensaje la imprime por pantalla y lo devuelve
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
