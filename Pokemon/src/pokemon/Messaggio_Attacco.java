/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;

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
        //at nomemossa danno effetto
        String[] csv = new String(packet.getData()).split(";");
        Mossa m = c.getMossaByName(csv[1]);
        if (m != null) {
            int danno = Integer.parseInt(csv[2]);
            danno = (int) (danno * c.efficaciaTipo(m.getTipo(), c.squadra.get(c.pokemonAttuale).getTipi()));

        } else {
            //cheating
        }
    }

}
