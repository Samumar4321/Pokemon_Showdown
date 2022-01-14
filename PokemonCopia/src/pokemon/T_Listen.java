/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samum
 */
public class T_Listen extends Thread {

    Condivisa c;
    Gestore_Packet gPacket;
    public int interrupt;

    public T_Listen() throws SocketException, UnknownHostException {
        c = Condivisa.getInstance();
        gPacket = Gestore_Packet.GetInstance();
        interrupt = 0;
    }

    @Override
    public void interrupt() {
        c.serverRicezione.close();
    }

    @Override
    public void run() {
        if (c.serverRicezione.isClosed()) {
            try {
                c.serverRicezione = new DatagramSocket(12346);
            } catch (SocketException ex) {
                Logger.getLogger(T_Listen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (interrupt == 0) {
            try {
                byte[] buffer = new byte[1500];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                c.serverRicezione.receive(packet);
                gPacket.execute(packet);
                //c.gPacket.add(packet);
                System.out.println("p ricevuto\n");
            } catch (SocketException ex) {
                System.out.println(ex.toString());
                break;
            } catch (IOException ex) {
                System.out.println(ex.toString());
                break;
            }

            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(T_Listen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("FINE LISTEN");
    }

}
