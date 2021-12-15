/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author marelli_samuele
 */
public class Mossa {

    private int id;
    private Tipo tipo;
    private String nome;
    private int dannoBase;
    private Object effetto;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDannoBase() {
        return dannoBase;
    }

    public void setDannoBase(int dannoBase) {
        this.dannoBase = dannoBase;
    }

    public Object getEffetto() {
        return effetto;
    }

    public void setEffetto(Object effetto) {
        this.effetto = effetto;
    }

    public Mossa() {
        this.id = 0;
        this.tipo = null;
        this.nome = "";
        this.dannoBase = 0;
        this.effetto = null;
    }

    public Mossa(int id, String nome, Tipo tipo, int dannoBase, Object effetto) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.dannoBase = dannoBase;
        this.effetto = effetto;
    }

    @Override
    public String toString() {
        String str = "";
        str = id + "\t" + nome + ":\n";
        str += "\t\tTipo: " + tipo.getNome() + "\n";
        str += "\t\tDanno: " + dannoBase + "\n";
        str += "\t\tEffetto: " + "\n";
        return str;
    }

}
