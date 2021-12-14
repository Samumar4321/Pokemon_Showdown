/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marelli_samuele
 */
public class Tipo {

    private String nome;
    private List<String> Do_twotimedamage;
    private List<String> Do_halfdamage;
    private List<String> Do_nodamage;

    public Tipo(String name) {
        nome = name;
        Do_twotimedamage = new ArrayList<String>();
        Do_halfdamage = new ArrayList<String>();
        Do_nodamage = new ArrayList<String>();
    }

    public void addWeakness(String name) {
        Do_halfdamage.add(name);
    }

    public void addStrenght(String name) {
        Do_twotimedamage.add(name);
    }

    public void addImmunity(String name) {
        Do_nodamage.add(name);
    }

    @Override
    public String toString() {
        String str = "";
        str = nome + ":\n";
        str += "\t2x damage:\n";
        for (int i = 0; i < Do_twotimedamage.size(); i++) {
            str += "\t\t" + Do_twotimedamage.get(i) + "\n";
        }
        str += "\t1.5x damage:\n";
        for (int i = 0; i < Do_halfdamage.size(); i++) {
            str += "\t\t" + Do_halfdamage.get(i) + "\n";
        }
        str += "\t0x damage:\n";
        for (int i = 0; i < Do_nodamage.size(); i++) {
            str += "\t\t" + Do_nodamage.get(i) + "\n";
        }
        return str;
    }

}


//normale;;roccia-acciaio;spettro;
//lotta;normale-roccia-acciao-ghiaccio-buio;volante-veleno-coleottero-psico-folletto;spettro;
//volante;lotta-coleottero-erba;roccia-acciaio-elettro;;
//veleno;erba-folletto;veleno-terra-roccia-spettro;acciaio;
//terra;veleno-roccia-acciaio-fuoco-elettro;coleottero-erba;volante;
//roccia;volante-coleottero-fuoco-ghiaccio;lotta-terra-acciaio;;
//coleottero;erba-psico-buio;lotta-volante-veleno-spettro-acciaio-fuoco-folletto;;
//spettro;spettro-psico;buio;normale;;
//acciaio;roccia-ghiaccio-folletto;acciaio-fuoco-acqua-elettro;;
//fuoco;coleottero-acciaio-erba-ghiaccio;roccia-fuoco-acqua-drago;;
//acqua;roccia-terra-fuoco;acqua-erba-drago;;
//erba;terra-roccia-acqua;volante-veleno-coleottero-acciaio-fuoco-erba-drago;;
//elettro;volante-acqua;erba-elettro-drago;terra;
//psico;lotta-veleno;acciaio-psico;buio;
//ghiaccio;volante-terra-erba-drago;acciaio-fuoco-acqua-ghiaccio;;
//drago;drago;acciaio;folletto;
//buio;spettro-psico;lotta-buio-folletto;;
//folletto;lotta-drago-buio;veleno-acciaio-fuoco;;