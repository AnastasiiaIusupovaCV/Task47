/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task47;

/**
 *
 * @author a.yusupova
 */
public class SynchromizingObject {
    int maxIterations;
    int counter = 0;
    SynchromizingObject(int maxIt)
    {
        maxIterations = maxIt;
        
    }
    
    public synchronized void incrementCounter()
    {
            counter++;
    }
    
    public synchronized int count()
    {
        int result;
            result = counter;
        return result;
    }
    
    public synchronized boolean maxItersReached()
    {
        boolean result = false;
            result = counter >= maxIterations;
        return result;
    }
}
