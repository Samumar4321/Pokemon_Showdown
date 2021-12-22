/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samum
 */
public class Gestore_Packet {

    InetAddress connectedIP = null;
    Condivisa c;
    static Gestore_Packet instance = null;

    private Gestore_Packet() throws SocketException, UnknownHostException {
        c = Condivisa.getInstance();
    }

    static Gestore_Packet GetInstance() throws SocketException, UnknownHostException {
        if (instance == null) {
            synchronized (Gestore_Packet.class) {
                if (instance == null) {
                    instance = new Gestore_Packet();
                }
            }
        }
        return instance;
    }

    public void execute(DatagramPacket p) throws UnknownHostException, SocketException {
        byte[] buffer = p.getData();
        String action = new String(buffer).split(";")[0];
        System.out.println("ACTION: " + action);
        if (action.equals("a")) {
            connectedIP = p.getAddress();
            Messaggio_Apertura ma = new Messaggio_Apertura(p);
            ma.execute();
        } else if (p.getAddress().equals(connectedIP)) {
            switch (action) {
                case "c": {
                    Messaggio_Chiusura mc = new Messaggio_Chiusura(p);
                    mc.execute();
                    connectedIP = null;
                    break;
                }
                case "y": {
                    try {
                        connectedIP = p.getAddress();
                        Messaggio_RispApertura mar = new Messaggio_RispApertura(p);
                        mar.execute();
                    } catch (SocketException ex) {
                        Logger.getLogger(Gestore_Packet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case "n": {
                    connectedIP = null;
                    break;
                }

            }
        }

    }
}
