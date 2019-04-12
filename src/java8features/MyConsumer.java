/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8features;

import java.util.function.Consumer;

/**
 *
 * @author tommib
 */
public class MyConsumer implements Consumer{

    @Override
    public void accept(Object t) {
        System.out.println(t);
    }
    
}
