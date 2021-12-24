/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author samum
 */
public class Eff_Scottatura extends Effetto {

    int dannoTic;//danno basatu su divisione di vita ES 100 hp con 16 dannoTic fai 100 - (100/16) 
    int ridAttacco;//percentuale

    public Eff_Scottatura(int id, String nome, int durata, int danno, int rid) {
        super(id, nome, durata);
        dannoTic = danno;
        ridAttacco = rid;
    }

    @Override
    public int execute(Pokemon p) {
        if (durata > 0) {
            if (durata == 3) {
                int att = p.getAttacco();
                att = att / (100 / ridAttacco);
                p.setAttacco(att);
            }
            int hp = p.getVitaAttuale();
            hp = hp - (p.getVitaMax() / dannoTic);
            p.setVitaAttuale(hp);
            durata--;
            System.out.println("Eseguito effetto: " + nome);
            return 0;
            
        }
        return -1;
    }
}
