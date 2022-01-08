/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.net.SocketException;

/**
 *
 * @author marelli_samuele
 */
public class Consumabile {

    public String nome;
    public int id;
    public int quantita;

    public Consumabile() {
        nome = "";
        id = -1;
        quantita = 0;
    }

    public Consumabile(int id, String nome, int quantita) {
        this.nome = nome;
        this.id = id;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void execute() throws SocketException {
        Condivisa c = Condivisa.getInstance();
        Pokemon p = c.squadra.get(c.pokemonAttuale);
        switch (nome) {
            case "pozione": {
                //cura 20 hp
                p.setVitaAttuale(p.getVitaAttuale() + 20);
                quantita--;
                break;
            }
            case "superpozione": {
                //cura 60 hp
                p.setVitaAttuale(p.getVitaAttuale() + 60);
                quantita--;
                break;
            }
            case "ricaricatotale": {
                p.setVitaAttuale(p.getVitaMax());
                quantita--;
                break;
            }
            case "revitalizzante": {
                //rianima pokemon a 50% hp
                break;
            }
            case "proteina": {
                //atk +10
                p.setAttacco(p.getAttacco() + 10);
                quantita--;
                break;
            }
            case "ferro": {
                //def +10
                p.setDifesa(p.getDifesa() + 10);
                quantita--;
                break;
            }
        }
    }
}
