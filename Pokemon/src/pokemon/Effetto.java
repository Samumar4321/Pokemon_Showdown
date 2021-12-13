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
abstract public class Effetto {
    String nome;
    int durata;

    public Effetto() {
    }
    
    abstract public void execute();
    
}
