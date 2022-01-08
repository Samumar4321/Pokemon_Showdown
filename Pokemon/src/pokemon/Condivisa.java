/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.awt.Frame;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marelli_samuele
 */
public class Condivisa {

    //database generale
    List<Consumabile> consumabili;
    List<Pokemon> pokemons;
    List<Mossa> mosse;
    List<ContainerEff> effetti;
    List<Tipo> tipi;

    //giocatore
    List<Pokemon> squadra;
    int pokemonAttuale;
    String nome;
    boolean turno = false;
    int numePokemon;

    //avversario
    Pokemon pokemonAvversario;
    int pokRimanentiAvv;
    String nomeDestinatario;

    private static Condivisa instance = null;
    Frame frame;
    boolean connected;
    boolean mittente;
    DatagramSocket serverRicezione;
    DatagramSocket serverInvio;

    private Condivisa() throws SocketException {
        consumabili = new ArrayList();
        pokemons = new ArrayList();
        mosse = new ArrayList();
        effetti = new ArrayList();
        tipi = new ArrayList<Tipo>();
        frame = new Frame();
        squadra = new ArrayList<Pokemon>();
        pokemonAttuale = 0;
        this.serverRicezione = new DatagramSocket(12346);
        serverInvio = new DatagramSocket();
    }

    public static Condivisa getInstance() throws SocketException {
        if (instance == null) {
            synchronized (Condivisa.class) {
                if (instance == null) {
                    instance = new Condivisa();
                }
            }
        }
        return instance;
    }

    public double efficaciaTipo(Tipo tipoMossa, List<Tipo> tipiPokemon) {
        double multiplier = 1.0;
        for (Tipo tipoPokemon : tipiPokemon) {
            if (tipoMossa.getDo_halfdamage().contains(tipoPokemon.getNome())) {
                multiplier *= 0.5;
            } else if (tipoMossa.getDo_twotimedamage().contains(tipoPokemon.getNome())) {
                multiplier *= 2.0;
            } else if (tipoMossa.getDo_nodamage().contains(tipoPokemon.getNome())) {
                multiplier *= 0.0;
            }
        }
        return multiplier;
    }

    public Mossa getMossaByName(String name) {
        for (int i = 0; i < mosse.size(); i++) {
            if (mosse.get(i).getNome().equals(name)) {
                return mosse.get(i);
            }
        }
        return null;
    }

    public Consumabile getOggettoByName(String name) {
        for (int i = 0; i < consumabili.size(); i++) {
            if (consumabili.get(i).getNome().equals(name)) {
                return consumabili.get(i);
            }
        }
        return null;
    }

    public Pokemon getPokemonByName(String name) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getNome().equals(name)) {
                return pokemons.get(i);
            }
        }
        return null;
    }

    public boolean isMittente() {
        boolean temp = mittente;
        mittente = false;
        return temp;
    }

}
