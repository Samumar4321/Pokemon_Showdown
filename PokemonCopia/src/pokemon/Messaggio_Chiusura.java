/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 *
 * @author marelli_samuele
 */
public class Messaggio_Chiusura extends Messaggio {

    public Messaggio_Chiusura(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
    }

    @Override
    public void execute() {
        c.connected = false;
        c.win = true;
        JOptionPane.showMessageDialog(c.frame, "CONGRATURAZIONI HAI VINTO!!!!!!!!!!!!!!");
    }

}
