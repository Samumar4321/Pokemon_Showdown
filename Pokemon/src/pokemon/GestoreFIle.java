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

    String path;

    public GestoreFIle(String path) {
        this.path = path;
    }

    public List<Tipo> loadTipi() throws FileNotFoundException, IOException {

        List<Tipo> tipi = new ArrayList<Tipo>();
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        for (String line = ""; (line = br.readLine()) != null;) {
            String[] csv = line.split(";");
            Tipo t = new Tipo(Integer.parseInt(csv[0]),csv[1]);
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
        return tipi;
    }
}
