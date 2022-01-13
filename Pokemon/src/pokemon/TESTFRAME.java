/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pokemon;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Startex
 */
public class TESTFRAME extends javax.swing.JFrame {

    private Condivisa c;
    private int cont;
    private String nomeP;
    private DefaultListModel<String> model;
    private JList<String> list;
    private List<Pokemon> p;
    private Pokemon pok;
    private SecondaFinestra win2;
    private StatisticaPokemonGui sp;

    /**
     * Creates new form TESTFRAME
     */
    public TESTFRAME() throws IOException {

        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setTitle("Pokemon");
        LoadGame();
        cont = 0;

        model = new DefaultListModel<>();
        list = new JList<>(model);

        c = Condivisa.getInstance();
        p = c.pokemons;
        pok = p.get(0);
        nomeP = pok.getNome();
        ImageIcon ic = new ImageIcon();
        Image img = ImageFromUrl.show(pok.getImgFront());

        ImageIcon icon = new ImageIcon(img);
        jLabel3.setText(nomeP);
        jLabel4.setIcon(icon);
        //showTestConnessione();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 100, 1000, 600));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/freccia_b.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seleziona.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/freccia_f.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Squadra");

        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setText("Rimuovi dalla squadra");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nickname: ");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lotta.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 153));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/statistiche.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane2.setViewportView(jTextPane1);
        jTextPane1.getAccessibleContext().setAccessibleName("txtNick");

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jList1);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jButton1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(26, 26, 26)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jButton1.getAccessibleContext().setAccessibleName("btnArrowLeft");
        jButton2.getAccessibleContext().setAccessibleName("btnSeleziona");
        jButton3.getAccessibleContext().setAccessibleName("btnArrowRight");
        jLabel1.getAccessibleContext().setAccessibleName("lblSquadra");
        jButton4.getAccessibleContext().setAccessibleName("btnRimuovi");
        jLabel2.getAccessibleContext().setAccessibleName("lblNickName");
        jButton5.getAccessibleContext().setAccessibleName("btnLotta");
        jLabel3.getAccessibleContext().setAccessibleName("lblNomePokemon");
        jButton6.getAccessibleContext().setAccessibleName("btnStat");
        jLabel4.getAccessibleContext().setAccessibleName("iconPokemon");

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void showTestConnessione() throws SocketException, UnknownHostException {
        TestConnessioneFrame test = new TestConnessioneFrame();
        test.show();
        this.dispose();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //LOTTA

        if (!jTextPane1.getText().equals("") && model.getSize() == 6) {

            try {
                setSquadra();
                //NEW WINDOW
                win2 = new SecondaFinestra();
                win2.setVisible(true);
                this.setVisible(false);
            } catch (SocketException ex) {
                Logger.getLogger(TESTFRAME.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(TESTFRAME.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TESTFRAME.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            //MESSAGGIO DI ERRORE
            TESTFRAME.infoBox("La tua squadra non è al completo o hai dimenticato il nickname!", "Ops..");
        }

    }//GEN-LAST:event_jButton5ActionPerformed
    private void setSquadra() {
        c.squadra.clear();
        for (int j = 0; j < 6; j++) {
            String nomeP = model.get(j);

            Pokemon p = new Pokemon(c.getPokemonByName(nomeP));
            c.squadra.add(p);
        }
        c.numePokemon = 6;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //ARR RIGHT
        try {
            c = Condivisa.getInstance();
            if (cont < c.pokemons.size() - 1) {
                cont++;
            }

            if (cont == 9) {
                jButton3.setEnabled(false);
            }

            if (cont != 0) {
                jButton1.setEnabled(true);
            }

            p = c.pokemons;
            pok = p.get(cont);
            nomeP = pok.getNome();
            ImageIcon ic = new ImageIcon();
            Image img = ImageFromUrl.show(pok.getImgFront());

            ImageIcon icon = new ImageIcon(img);
            jLabel3.setText(nomeP);
            jLabel4.setIcon(icon);

        } catch (SocketException ex) {
            Logger.getLogger(TESTFRAME.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //ARR LEFT
        try {
            c = Condivisa.getInstance();
            if (cont > 0) {
                cont--;
            }

            if (cont == 0) {
                jButton1.setEnabled(false);
            }

            jButton3.setEnabled(true);

            p = c.pokemons;
            pok = p.get(cont);
            nomeP = pok.getNome();
            ImageIcon ic = new ImageIcon();
            Image img = ImageFromUrl.show(pok.getImgFront());

            ImageIcon icon = new ImageIcon(img);
            jLabel3.setText(nomeP);
            jLabel4.setIcon(icon);

        } catch (SocketException ex) {
            Logger.getLogger(TESTFRAME.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //SELEZIONA
        if (model.getSize() < 6) {
            p = c.pokemons;
            pok = p.get(cont);

            nomeP = pok.getNome();
            model.addElement(nomeP);
            jList1.setModel(model);
        } else {
            jButton2.setEnabled(false);
            TESTFRAME.infoBox("La tua squadra è al completo!", "Ops..");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //REMOVE SQUADRA
        boolean trovato = false;
        for (int i = 0; i < model.size() && trovato == false; i++) {
            if (model.get(i).equals(nomeP)) {
                trovato = true;
                model.remove(i);
                jButton2.setEnabled(true);
            }
        }

        if (trovato == false) {
            TESTFRAME.infoBox("Non hai selezionato nessun pokemon!", "Ops..");
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        sp = new StatisticaPokemonGui();

        sp.setVisible(true);


    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TESTFRAME.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TESTFRAME.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TESTFRAME.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TESTFRAME.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TESTFRAME().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TESTFRAME.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

    @Override
    public void setContentPane(Container contentPane) {
        super.setContentPane(contentPane);

    }

    class backgroundPanel extends JComponent {

        private Image image;

        public backgroundPanel(Image image) {
            this.image = image;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponents(g);
            g.drawImage(image, 0, 0, this);
        }
    }

    public ImageIcon getImage(String path) {
        ImageIcon ic = new ImageIcon(path);
        return ic;
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
        LoadOggetti();
        c.effetti = loadEffetti();
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

    private void LoadOggetti() throws SocketException {
        Condivisa c = Condivisa.getInstance();
        Consumabile pozione = new Consumabile(0, "pozione", 5);
        c.consumabili.add(pozione);
        Consumabile superpozione = new Consumabile(0, "superpozione", 3);
        c.consumabili.add(superpozione);
        Consumabile ricaricaTot = new Consumabile(0, "ricaticatotale", 1);
        c.consumabili.add(ricaricaTot);
        Consumabile rev = new Consumabile(0, "revitalizzante", 1);
        c.consumabili.add(rev);
        Consumabile prote = new Consumabile(0, "proteina", 5);
        c.consumabili.add(prote);
        Consumabile ferro = new Consumabile(0, "ferro", 5);
        c.consumabili.add(ferro);

    }

    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
