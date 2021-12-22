/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samum
 */
public class GestoreFIle {

    Condivisa c;

    public GestoreFIle(Condivisa c) {
        this.c = c;
    }

    public List<Tipo> loadTipi(String path) throws FileNotFoundException, IOException {

        List<Tipo> tipi = new ArrayList<Tipo>();
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        for (String line = ""; (line = br.readLine()) != null;) {
            String[] csv = line.split(";");
            Tipo t = new Tipo(Integer.parseInt(csv[0]), csv[1]);
            String[] temp = csv[2].split("-");
            for (int i = 0; i < temp.length; i++) {
                t.addStrenght(temp[i]);
            }
            temp = csv[3].split("-");
            for (int i = 0; i < temp.length; i++) {
                t.addWeakness(temp[i]);
            }
            if (csv.length > 5) {
                if (!csv[4].equals("")) {
                    temp = csv[4].split("-");
                    for (int i = 0; i < temp.length; i++) {
                        t.addImmunity(temp[i]);
                    }
                }
            }

            tipi.add(t);
        }
        br.close();
        return tipi;
    }

    public List<Mossa> loadMosse(String path) throws FileNotFoundException, IOException {

        List<Mossa> mosse = new ArrayList<Mossa>();
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        for (String line = ""; (line = br.readLine()) != null;) {
            String[] csv = line.split(";");
            Tipo t = null;
            for (int i = 0; i < c.tipi.size(); i++) {
                if (Integer.parseInt(csv[2]) == c.tipi.get(i).getId()) {
                    t = c.tipi.get(i);
                    break;
                }
            }
            if (t != null) {
                //id, nome, tipo, danno, effetto
                Mossa m = new Mossa(Integer.parseInt(csv[0]), csv[1], t, Integer.parseInt(csv[3]), null);
                mosse.add(m);
            }
        }
        br.close();
        return mosse;
    }

    public List<Pokemon> loadPokemon(String path) throws FileNotFoundException, IOException {

        List<Pokemon> pks = new ArrayList<Pokemon>();
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        for (String line = ""; (line = br.readLine()) != null;) {
            String[] csv = line.split(";");
            Pokemon pokemon = new Pokemon();
            pokemon.setId(Integer.parseInt(csv[0]));
            pokemon.setNome(csv[1]);
            pokemon.setVita(Integer.parseInt(csv[2]));
            pokemon.setAttacco(Integer.parseInt(csv[3]));
            pokemon.setDifesa(Integer.parseInt(csv[4]));
            String[] temp = csv[5].split("-");
            for (int j = 0; j < temp.length; j++) {
                Tipo tp = null;
                for (int i = 0; i < c.tipi.size(); i++) {
                    if (Integer.parseInt(temp[j]) == c.tipi.get(i).getId()) {
                        tp = c.tipi.get(i);
                        pokemon.addTipo(tp);
                        break;
                    }
                }

            }
            temp = csv[6].split("-");
            for (int j = 0; j < temp.length; j++) {
                Mossa m = null;
                for (int i = 0; i < c.mosse.size(); i++) {
                    if (Integer.parseInt(temp[j]) == c.mosse.get(i).getId()) {
                        m = c.mosse.get(i);
                        pokemon.addMosa(m);
                        break;
                    }
                }

            }
            pokemon.setImgFront(csv[7]);
            pokemon.setImgBack(csv[8]);
            pks.add(pokemon);
          
        }
        br.close();
        return pks;
    }
}
