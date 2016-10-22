
package n3.psp;

/**
 *
 * @author Julián
 */
public class N3PSP {

    
    public static void main(String[] args) throws InterruptedException {
        Fio f1= new Fio("f1");
        f1.setName("Hilo 1");
         Fio f2= new Fio("f2");
        f2.setName("Hilo 2");
         Fio f3= new Fio("f3");
        f3.setName("Hilo 3");
         Fio f4= new Fio("f4");
        f4.setName("Hilo 4");
         Fio f5= new Fio("f5");
        f5.setName("Hilo 5");
        f1.start();
        f1.join();
        f2.start();
        f2.join();
        f3.start();
        f3.join();
        f4.start();
        f4.join();
        f5.start();
        f5.join();
        
        
    }
    
}
