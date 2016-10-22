package n3.psp;



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
        for (int i = 0; i <=5; i++) {
            Thread h1 = new Thread();
            h1.setName("p1_"+i);
            System.out.println(h1.getName()+"Procesando");
           
        }
        System.out.println(getName()+" Terminó \n");
    }
}
