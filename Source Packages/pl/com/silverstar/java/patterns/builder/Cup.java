/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.java.patterns.builder;

/**
 *
 * @author sylwester.stocki
 */
public class Cup implements Packing {

    @Override
    public String pack() {
        return this.getClass().getSimpleName();
    }

}
