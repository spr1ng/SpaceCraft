/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecraft.utils;

import java.util.List;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version $Id$
 * @author rsen
 */
public class RandomUtilsTest {
    
    public RandomUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRandom method, of class RandomUtils.
     */
    @Test
    public void testGetRandom() {
        System.out.println("getRandom");
        List<Integer> expResult = Arrays.asList(0, 1, 2, 3, 4);
        for (int i = 0; i < 12; i++) {
            int result = RandomUtils.getRandom(0, 4);
            System.out.print(result + " ");
            assertTrue(expResult.contains(result));
        }
    }
}
