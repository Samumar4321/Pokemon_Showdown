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
public class Eff_Veleno extends Effetto {

    int dannoTic;//danno basatu su divisione di vita ES 100 hp con 8 dannoTic fai 100 - (100/8)   

    public Eff_Veleno(int id, String nome, int durata, int dannoTic) {
        super(id, nome, durata);
        this.dannoTic = dannoTic;
    }

    @Override
    public int execute(Pokemon p) {

    }


}
