/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author samum
 */
public class Eff_Sonno extends Effetto {
    //duarata casuale compresa fra 1 e 7 turni, calcolata quando si applica

    private int minDurata = 1;
    private int maxDuarata = 7;

    public Eff_Sonno(int id, String nome, int durata) {
        super(id, nome, durata);
    }

    @Override
    public int execute(Pokemon p) {
     
    }

}
