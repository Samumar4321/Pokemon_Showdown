/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

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
    List<Object> effetti;
    List<Tipo> tipi;
    public Condivisa() {
        consumabili = new ArrayList();
        pokemons = new ArrayList();
        mosse = new ArrayList();
        effetti = new ArrayList();
        tipi = new ArrayList<Tipo>();
    }

}
