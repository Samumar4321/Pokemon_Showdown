/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author samum
 */
public class Eff_Cura extends Effetto {

    int cura;

    public Eff_Cura(int id, String nome, int cura, int durata) {
        super(id, nome, durata);
        this.cura = cura;
    }

    @Override
    public void execute(Pokemon p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
