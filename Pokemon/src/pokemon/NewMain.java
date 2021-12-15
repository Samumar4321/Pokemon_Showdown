/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author marelli_samuele
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*
        List effetti;
        effetti = new ArrayList();
        effetti.add("ciao");
        effetti.add(12);
        effetti.add(45.32);
        for (int i = 0; i < effetti.size(); i++) {
            System.out.println("Lita numero:" + i + "--" + effetti.get(i));
        }
         */
        Condivisa c = new Condivisa();
        GestoreFIle gf = new GestoreFIle(c);
        List<Tipo> tp = gf.loadTipi("tipi.txt");
        System.out.println("-------------------TIPI-------------------");
        for (Tipo t : tp) {
            System.out.println(t.toString() + "\n\n");
        }
        c.tipi = tp;
        List<Mossa> ms = gf.loadMosse("mosse.txt");
        System.out.println("\n\n\n");
        System.out.println("-------------------MOSSE-------------------");
        for (Mossa m : ms) {
            System.out.println(m.toString() + "\n\n");
        }
        JFrame frame = new JFrame();
        frame.setEnabled(true);
        frame.setSize(1000, 1000);
        frame.show();

    }

}
