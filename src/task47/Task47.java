/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task47;

/**
 *
 * @author a.yusupova
 */
public class Task47 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
        SynchromizingObject o = new SynchromizingObject(100);
        Thread[] pool = new Thread[10];
        
        for(int i=0; i<10;++i)
        {
            pool[i] = new Thread(new RunnableExample(o, "Thread"+i));
            pool[i].start();
        }
        
        // notify all threads to start ticking
        synchronized (o) {
            
            o.notify();
        }
        
        
        
    }
    
}
