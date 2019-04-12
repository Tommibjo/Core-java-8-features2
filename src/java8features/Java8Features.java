/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author tommib
 */
public class Java8Features {

    /**
     * @param args the command line arguments
     * 
     * Koira luokka toteuttaa nisakas rajapinnan.
     * Nisakas rajapinnalla on "default" metodi, jolle voi antaa metodin sisällön!
     * Tälle Default metodi käyttää forEach / consumer "interface implementationia", joka laskee koiralle annetun taulukon
     * 
     * Default:
     * Hyviä vanhojen legacy softien päivitystä varten, mikäli rajapintoja tarvitsee päivittää. Tällöin ei riko rajapintaa 
     * valmiiksi toteuttavia luokkia.
     * 
     * Static:
     * Hyvää tavaraa koheesion kasvattamiseen.
     */
    public static void main(String[] args) {
        
        // Rajapinnan default metodien testausta, sekä Iterable rajapinnan forEachin kertausta.
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            lista.add(i);
        }
        // (Astetta älykkäämpi koira)
        Koira koira = new Koira();
        koira.laske(lista);
        
        // Rajapinnan staattisten metodien testausta
        System.out.println("Laskuri rajapintaa:");
        System.out.println(StaattistenRajapinta.kerro(3, 2));
        System.out.println(StaattistenRajapinta.miinusta(3, 2));
        System.out.println(StaattistenRajapinta.plussaa(3, 2));
        
    }
    
}
