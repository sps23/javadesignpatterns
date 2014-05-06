/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.java.patterns.singleton;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sylwester.stocki
 */
public class EarlySingletonTest {

    public EarlySingletonTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class EarlySingleton.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EarlySingleton instance1 = EarlySingleton.getInstance();
        EarlySingleton instance2 = EarlySingleton.getInstance();
        Assert.assertTrue(instance1 == instance2);
    }

}
