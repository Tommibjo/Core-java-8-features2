/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features;

/**
 *
 * @author tommib
 */
public interface StaattistenRajapinta {
    
    static int kerro(int ekaLuku, int tokaLuku){
        return ekaLuku * tokaLuku;
    }
    
    static int plussaa(int ekaLuku, int tokaLuku){
        return ekaLuku + tokaLuku;        
    }
    
    static int miinusta(int ekaLuku, int tokaLuku){
        return ekaLuku - tokaLuku;
    }
    
}
