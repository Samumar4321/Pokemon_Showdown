/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author samum
 */
public class Eff_Confusione extends Effetto {
    
    private int autoAttack = 50;//percentuale
    public Eff_Confusione(int id, String nome, int durata) {
        super(id, nome, durata);
    }

    @Override
    public int execute(Pokemon p) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  

}
