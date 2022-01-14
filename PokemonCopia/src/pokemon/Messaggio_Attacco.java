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
import javax.swing.JOptionPane;

/**
 *
 * @author samum
 */
public class Messaggio_Attacco extends Messaggio {

    public Messaggio_Attacco(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
    }

    @Override
    public void execute() {

        try {
            Pokemon pAttuale = c.squadra.get(c.pokemonAttuale);
            //at nomemossa danno effetto
            String[] csv = new String(packet.getData()).split(";");
            Mossa m = c.getMossaByName(csv[1]);
            if (m != null) {
                //calcolo
                int danno = Integer.parseInt(csv[2]);
                double molt = (c.efficaciaTipo(m.getTipo(), c.squadra.get(c.pokemonAttuale).getTipi()));
                danno = (int) ((((42) * ((danno) / pAttuale.getDifesa())) / 50) * molt); //mancano gli eventuali buff e debuff
                pAttuale.setVitaAttuale(pAttuale.getVitaAttuale() - danno);
                System.out.println("MOSSA AVVERSARIO: " + m.toString());
                c.frame.repaint();
                if (pAttuale.getVitaAttuale() <= 0) {
                    c.numePokemon--;
                }
                if (danno == 0) {
                    JOptionPane.showMessageDialog(c.frame, "ASPETTARE IL PROPRIO TURNO");
                }
//            if (molt >= 0.0 && molt < 1.0) {
//                //poco efficace
//            } else if (molt >= 1.0 && molt < 2.0) {
//                //efficace
//            } else if (molt >= 2.0 && molt <= 4.0) {
//                //super efficace
//            }
            } else {
                //miss
            }
            String str = "";
            str = "hp;" + pAttuale.getVitaAttuale() + ";";
            send(str);          
        } catch (IOException ex) {
            Logger.getLogger(Messaggio_Attacco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
