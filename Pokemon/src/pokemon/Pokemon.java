/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author marelli_samuele
 */
public class Pokemon {

    private int difesa;
    private int attacco;
    private String nome;
    private Tipo tipi[];
    private int vita;
    private List effetti;
    private List<Mossa> mosse;
    private String imgpath;

    public Pokemon() {
        effetti = new ArrayList();
    }

}
