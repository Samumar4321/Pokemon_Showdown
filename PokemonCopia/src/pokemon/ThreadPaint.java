/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samum
 */
public class ThreadPaint extends Thread{
    Condivisa c;

    public ThreadPaint() throws SocketException {
        c = Condivisa.getInstance();
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                c.frame.repaint();
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadPaint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
