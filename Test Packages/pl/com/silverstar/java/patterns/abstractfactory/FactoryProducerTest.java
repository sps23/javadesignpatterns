/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.java.patterns.abstractfactory;

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
public class FactoryProducerTest {

    public FactoryProducerTest() {
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
     * Test of getFactory method, of class FactoryProducer.
     */
    @Test
    public void testGetFactory() {
        System.out.println("getFactory");
        String type = "COLOR";
        AbstractFactory colorFactory = FactoryProducer.getFactory(type);
        Assert.assertTrue(colorFactory instanceof ColorFactory);

        type = "SHAPE";
        AbstractFactory shapeFactory = FactoryProducer.getFactory(type);
        Assert.assertTrue(shapeFactory instanceof ShapeFactory);

        Color color = colorFactory.getColor("RED");
        Assert.assertNotNull(color);

        Shape shape = colorFactory.getShape("CIRCLE");
        Assert.assertNull(shape);

        color = shapeFactory.getColor("RED");
        Assert.assertNull(color);

        shape = shapeFactory.getShape("CIRCLE");
        Assert.assertNotNull(shape);

    }

}
