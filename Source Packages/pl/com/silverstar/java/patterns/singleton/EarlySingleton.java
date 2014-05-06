/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.java.patterns.singleton;

/**
 *
 * @author sylwester.stocki
 */
public class EarlySingleton {

    private static final EarlySingleton singleton = new EarlySingleton();

    private EarlySingleton() {
        System.out.println("Privaqte constructor of EarlySingleton().");
    }

    public EarlySingleton getInstance() {
        return singleton;
    }

    public void doSth() {
        System.out.println("EarlySingleton: doSth()");
    }
}
