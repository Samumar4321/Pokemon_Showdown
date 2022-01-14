/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samum
 */
public class Messaggio_RispApertura extends Messaggio {

    String nomeDest;

    public Messaggio_RispApertura(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
    }

    @Override
    public void execute() {
        System.out.println("DENTRO MESS_RISP_APER_EXEC");
        String[] csv = new String(packet.getData()).split(";");
        String risp = csv[0];
        if (risp.equals("y") && c.isMittente()) {
            c.turno = true;
            c.connected = true;
            c.nomeDestinatario = csv[1];
            String str = "y;";
            try {
                send(str);
            } catch (IOException ex) {
                Logger.getLogger(Messaggio_RispApertura.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (risp.equals("y")) {
            try {
                c.connected = true;
                c.turno = false;
                Lotta lotta = new Lotta();
                lotta.setVisible(true);
                c.frame.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(Messaggio_RispApertura.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (risp.equals("n")) {
            c.connected = false;
            c.turno = false;
        }
        System.out.println("USCITO MESS_RISP_APER_EXEC\n");
    }

}
