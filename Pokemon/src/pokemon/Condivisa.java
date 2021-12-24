/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marelli_samuele
 */
public class Condivisa {

    List<Consumabile> consumabili;
    List<Pokemon> pokemons;
    List<Mossa> mosse;
    List<ContainerEff> effetti;
    List<Tipo> tipi;
    private static Condivisa instance = null;
    Frame frame;
    String nomeDestinatario;
    boolean connected;
    String nome;
    private boolean mittente;

    private Condivisa() {
        consumabili = new ArrayList();
        pokemons = new ArrayList();
        mosse = new ArrayList();
        effetti = new ArrayList();
        tipi = new ArrayList<Tipo>();
        frame = new Frame();
    }

    public static Condivisa getInstance() {
        if (instance == null) {
            synchronized (Condivisa.class) {
                if (instance == null) {
                    instance = new Condivisa();
                }
            }
        }
        return instance;
    }

    public Pokemon SearchPokemonByName(String name) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getNome() == name) {
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
