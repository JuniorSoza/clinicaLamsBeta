package procesos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junior
 */
public class Hilo extends Thread{


    public void run(){

        try {
            for (int i = 0; i < 10000; i++) {
            System.out.print(i);
            
        }
            Thread.sleep(8);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
