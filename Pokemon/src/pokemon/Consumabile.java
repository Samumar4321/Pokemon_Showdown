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
public class Consumabile {
    private String nome;
    private Object effetto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Object getEffetto() {
        return effetto;
    }

    public void setEffetto(Object effetto) {
        this.effetto = effetto;
    }
}
