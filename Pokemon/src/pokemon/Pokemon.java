/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author marelli_samuele
 */
public class Pokemon {

    private int id;
    private String nome;
    private int vitaMax;
    private int vitaAttuale;
    private int attacco;
    private int difesa;
    private List<Tipo> tipi;
    private List<Mossa> mosse;
    private String imgFront;
    private String imgBack;
    private List<ContainerEff> effetti;

    public Pokemon() {
        effetti = new ArrayList<ContainerEff>();
        mosse = new ArrayList<Mossa>();
        tipi = new ArrayList<Tipo>();
        this.id = 0;
        this.nome = "";
        this.vitaMax = 0;
        this.vitaAttuale = 0;
        this.attacco = 0;
        this.difesa = 0;
        this.imgFront = "";
        this.imgBack = "";
    }

    public Pokemon(int id, String nome, int vita, int attacco, int difesa, List<Tipo> tipi, List<Mossa> mosse, String imgFront, String imgBack) {
        this.id = id;
        this.nome = nome;
        this.vitaMax = vita;
        this.vitaAttuale = vitaMax;
        this.attacco = attacco;
        this.difesa = difesa;
        this.tipi = tipi;
        this.mosse = mosse;
        this.imgFront = imgFront;
        this.imgBack = imgBack;
        this.effetti = new ArrayList<ContainerEff>();
    }

    @Override
    public String toString() {
        String str = id + "\t" + nome + "\n";
        str += "\t\tHP MAX: " + vitaMax + "\n";;
        str += "\t\tHP ATTUALI: " + vitaAttuale + "\n";;
        str += "\t\tAttacco: " + attacco + "\n";;
        str += "\t\tDifesa: " + difesa + "\n";;
        str += "\t\tTipi: ";
        for (Tipo t : tipi) {
            str += "\t" + t.getNome();
        }
        str += "\n";
        str += "\t\tMosse: ";
        for (Mossa m : mosse) {
            str += "\t" + m.getNome();
        }
        str += "\n";
        str += "\t\tFont: " + imgFront + "\n";
        str += "\t\tBack " + imgBack + "\n";
        return str;

    }

    public void eseguiEffetti() {
        for (int i = 0; i < effetti.size();i++) {
            //problema enorme    
            ContainerEff eff = effetti.get(i);
            int j = eff.execute(this);
            if (j == -1) {
                effetti.remove(eff);
            }
        }
    }

    public int getVitaAttuale() {
        return vitaAttuale;
    }

    public void setVitaAttuale(int vitaAttuale) {
        this.vitaAttuale = vitaAttuale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitaMax() {
        return vitaMax;
    }

    public void setVitaMax(int vitaMax) {
        this.vitaMax = vitaMax;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public List<Tipo> getTipi() {
        return tipi;
    }

    public void addTipo(Tipo tipo) {
        this.tipi.add(tipo);
    }

    public List<Mossa> getMosse() {
        return mosse;
    }

    public void addMosa(Mossa mossa) {
        this.mosse.add(mossa);
    }

    public String getImgFront() {
        return imgFront;
    }

    public void setImgFront(String imgFront) {
        this.imgFront = imgFront;
    }

    public String getImgBack() {
        return imgBack;
    }

    public void setImgBack(String imgBack) {
        this.imgBack = imgBack;
    }

    public List getEffetti() {
        return effetti;
    }

    public void addEffetto(ContainerEff effetto) {
        this.effetti.add(effetto);
    }

}
