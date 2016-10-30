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
        /**
         * Este bucle crea los 5 hilos principales
         */
        for (int i = 0; i <= 5; i++) {
            /**
             * Creamos el hilo lo iniciamos y le damos un nombre
             */
            Thread h1 = new Thread();
            h1.start();
            h1.setName("Principal");
            System.out.println(h1.getName() + " Iniciando " + i);
            /**
             * Este los 10 subhilos de los hilos principales.
             */
            for (int j = 0; j <= 10; j++) {
                Thread sub = new Thread();
                sub.setName("subhilo  " + j);
                sub.start();
                System.out.println(sub.getName() + " Procesando...");
            }

            h1.setName("Principal" + i);
            /**
             * El join para que espera a que se terminen los subhilos para sacar
             * el siguiente hilo.
             */
            try {
                h1.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(getName() + " Terminó \n");

    }
}
