/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pokemon;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author samum
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    Condivisa c;

    public MainFrame() throws IOException {
        initComponents();
        c = Condivisa.getInstance();
        c.frame = this;
        LoadGame();
        for (int i = 0; i < c.pokemons.size(); i++) {
            jComboBox1.addItem(c.pokemons.get(i).getNome());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POKEMON_SHOWDOWN");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(153, 0, 0));
        jComboBox1.setMaximumRowCount(5);
        jComboBox1.setDoubleBuffered(true);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(653, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(553, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        String name = jComboBox1.getSelectedItem().toString();
        Pokemon p = c.getPokemonByName(name);
        if (p != null) {
            urlFront = p.getImgFront();
            urlBack = p.getImgBack();
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, InterruptedException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread.sleep(5000);
        ThreadPaint tp = new ThreadPaint();
        tp.start();
/*
        Condivisa c = Condivisa.getInstance();
        Pokemon p = c.pokemons.get(0);
        p.addEffetto(c.effetti.get(2));
        p.eseguiEffetti();
        System.out.println("ciao");
        p.eseguiEffetti();
        System.out.println("ciao");
        p.eseguiEffetti();
        System.out.println("ciao");
        p.eseguiEffetti();
        System.out.println("ciao");
*/
    }

    String urlFront = "";
    String urlBack = "";

    @Override
    public void paint(Graphics g) {
//      super.paint(g);
        Image immagine = createImage(this.getWidth(), this.getHeight());
        Graphics gImmagine = immagine.getGraphics();
        gImmagine.clearRect(0, 200, this.getWidth(), this.getHeight());
//      g.clearRect(0, 200, this.getWidth(), this.getHeight());
        if (urlFront != "") {
            Image img = ImageFromUrl.show(urlFront);
            gImmagine.drawImage(img, 100, 300, this);
        }
        if (urlBack != "") {
            Image img = ImageFromUrl.show(urlBack);
            gImmagine.drawImage(img, 500, 300, this);
        }

        g.drawImage(immagine, 0, 0, this);
    }

    private void LoadGame() throws IOException {
        Condivisa c = Condivisa.getInstance();
        c.effetti = loadEffetti();
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
        c.mosse = ms;
        List<Pokemon> pks = gf.loadPokemon("pokemon.txt");
        for (Pokemon p : pks) {
            System.out.println(p.toString() + "\n\n");
        }
        c.pokemons = pks;
    }

    private List<ContainerEff> loadEffetti() {
        int i = 0;
        List<ContainerEff> effetti = new ArrayList<ContainerEff>();
        Eff_Veleno v = new Eff_Veleno(0, "veleno", 4, 8);
        ContainerEff e1 = new ContainerEff((Inteface) v);
        effetti.add(e1);

        Eff_Congelamento c = new Eff_Congelamento(1, "congelamento", 1);
        ContainerEff e2 = new ContainerEff((Inteface) v);
        effetti.add(e2);

        Eff_Scottatura s = new Eff_Scottatura(2, "scottatura", 3, 16, 50);
        ContainerEff e3 = new ContainerEff((Inteface) s);
        effetti.add(e3);

        Eff_Sonno sonno = new Eff_Sonno(3, "sonno", 0);
        ContainerEff e4 = new ContainerEff((Inteface) sonno);
        effetti.add(e4);

        Eff_Confusione confusione = new Eff_Confusione(4, "confusione", 2);
        ContainerEff e5 = new ContainerEff((Inteface) confusione);

        effetti.add(e5);

        return effetti;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
