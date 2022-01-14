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
public class Messaggio_Pokemon extends Messaggio {

    public Messaggio_Pokemon(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
    }

    @Override
    public void execute() {
        String[] csv = new String(packet.getData()).split(";");
        String action = csv[0];
        if (action.equals("p")) {
            Pokemon temp = c.getPokemonByName(csv[1]);
            if (temp != null) {
                //l'altro cambia il pokemon
                Pokemon p = new Pokemon(temp);
                p.setVitaAttuale(Integer.parseInt(csv[2]));
                c.pokRimanentiAvv = Integer.parseInt(csv[3]);
                c.pokemonAvversario = p;
                //c.turno = true;
                System.out.println("POKEMON AVVERSARIO: " + p.toString());
            }
        } else if (action.equals("hp")) {
            if (c.pokemonAvversario != null) {
                c.pokemonAvversario.setVitaAttuale(Integer.parseInt(csv[1]));
                System.out.println("HP AVVERSARIO: " + c.pokemonAvversario.toString());
            }

        }
    }
}
