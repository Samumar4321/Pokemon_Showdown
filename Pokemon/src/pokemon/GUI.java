/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package pokemon;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.EventListener;
import javax.imageio.ImageIO;

import javax.swing.*;


/**
 *
 * @author Startex
 */
public class GUI extends JFrame {
    
    
    private JButton btnLotta = new JButton(getImage("src\\img\\lotta.png"));
    private JButton btnArrowLeft = new JButton("", getImage("src\\img\\freccia_b.png"));
    private JButton btnArrowRight = new JButton("", getImage("src\\img\\freccia_f.png"));
    private JButton btnSeleziona = new JButton(getImage("src\\img\\seleziona.png"));
    private JButton btnStat = new JButton(getImage("src\\img\\statistiche.png"));
    private JButton btnRimuovi = new JButton("Rimuovi dalla squadra");
    
    private JLabel lblNomePokemon = new JLabel();
    private JLabel lblSquadra = new JLabel("Squadra");
    private JLabel lblTeam = new JLabel();
    private JLabel lblNickName = new JLabel("Inserisci il tuo nickname");
    
    private JTextField txtNick = new JTextField("");
    
    private ImageIcon iconPokemon = new ImageIcon();
    


    public GUI (){
        super("Stimple Test");
        this.setBounds(100, 100, 1200, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        
        
        
        
        Container container = this.getContentPane();
        
        container.setLayout(new GridLayout(6, 4));
        
        container.add(lblNomePokemon);
        container.add(btnStat);
        //container.add(iconPokemon);
        container.add(btnArrowLeft);
        container.add(btnSeleziona);
        container.add(btnArrowRight);
        
       
        container.add(lblSquadra);
        container.add(lblTeam);
        container.add(btnRimuovi);
        container.add(lblNickName);
        container.add(txtNick);
        container.add(btnLotta);
        
        
        //containerGlobal.setLayout(new BorderLayout());
        //containerGlobal.add(containerRight, BorderLayout.EAST);
        
        
        
        
    }


    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String message = "OK!";
            JOptionPane.showMessageDialog(null, message, "OUTPUT", JOptionPane.PLAIN_MESSAGE);
        }

    }

    
    public Frame getPanel(){
    return this;
    }
    
    //private Icon image = getImage("img/freccia_b");

    public ImageIcon getImage(String path) {
            ImageIcon ic = new ImageIcon(path);
        return ic;
    }
}
