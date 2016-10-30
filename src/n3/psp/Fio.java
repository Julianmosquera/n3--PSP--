package n3.psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julián
 */
public class Fio extends Thread {

    public Fio(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("Iniciando :" + getName());
        for (int i = 0; i <= 5; i++) {
            Thread h1 = new Thread();
            
            h1.start();
            h1.setName("Principal");
            System.out.println(h1.getName()+" Iniciando "+i);
            for (int j = 0; j <= 10; j++) {
                Thread sub=new Thread();
                sub.setName("subhilo  "+j);
                sub.start();
                System.out.println(sub.getName() + " Procesando...");
            }

            h1.setName("Principal" + i);
            
            try {
                h1.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(getName() + " Terminó \n");
        
       
        
                 }}
    
