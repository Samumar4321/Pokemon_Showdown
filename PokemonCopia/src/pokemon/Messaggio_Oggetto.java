/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samum
 */
public class Messaggio_Oggetto extends Messaggio {

    public Messaggio_Oggetto(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
    }

    @Override
    public void execute() {
//        try {
        String[] csv = new String(packet.getData()).split(";");
        String nome = csv[0];
        Consumabile ogg = c.getOggettoByName(nome);
        if (ogg != null) {
            try {
                ogg.execute(c.pokemonAvversario);
                System.out.println("OGGETTO AVVERSARO" + ogg.toString());
            } catch (SocketException ex) {
                Logger.getLogger(Messaggio_Oggetto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
//        } catch (SocketException ex) {
//            Logger.getLogger(Messaggio_Oggetto.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

}
