package pl.com.silverstar.java.patterns.factory;

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
public class ShapeFactoryTest {

    public ShapeFactoryTest() {
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
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        String type;
        ShapeFactory instance = new ShapeFactory();

        type = "CIRCLE";
        Shape result = instance.getShape(type);
        Assert.assertTrue(result instanceof Circle);

        type = "RECTANGLE";
        result = instance.getShape(type);
        Assert.assertTrue(result instanceof Rectangle);

        type = "SQUARE";
        result = instance.getShape(type);
        Assert.assertTrue(result instanceof Square);

        type = "NNN";
        result = instance.getShape(type);
        Assert.assertNull(result);

        type = null;
        result = instance.getShape(type);
        Assert.assertNull(result);
    }

}
