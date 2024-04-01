/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task47;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a.yusupova
 */
public class RunnableExample implements Runnable{
    SynchromizingObject o;
    String name;
    RunnableExample(SynchromizingObject ref, String name)
    {
        o = ref;
        this.name = name;
        System.out.println(name + " created");
    }

    @Override
    public void run() {
        System.out.println(name + " started");
        synchronized (o) {
            
        
            while(o.maxItersReached() == false)
            {
                try {
                    o.wait(1000); // wait for 1 sec
                } catch (InterruptedException ex) {
                    Logger.getLogger(RunnableExample.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(name + " counter = " + o.count());
                o.incrementCounter();
                o.notify();
            }
        }
        System.out.println(name + " exited");
    }
    
}
