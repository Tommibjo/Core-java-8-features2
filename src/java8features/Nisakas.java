/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features;

import java.util.ArrayList;

/**
 *
 * @author tommib
 */
public interface Nisakas {
    
    void hauku();
    void syo();
    default void laske(ArrayList<Integer> lista){
        MyConsumer consumer = new MyConsumer();
        lista.forEach(consumer);
    }
    
}
