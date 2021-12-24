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
//una classe per effetto stile messaggio
abstract public class Effetto implements Inteface{

    String nome;
    int durata;
    private int id;

    public Effetto(int id) {
        nome = "";
        durata = 0;
        this.id = id;
    }

    public Effetto(int id, String nome, int durata) {
        this.nome = nome;
        this.durata = durata;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    abstract public int execute(Pokemon p);

}
