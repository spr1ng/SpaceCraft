/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecraft.utils;

import java.util.Random;

/**
 * @version $Id$
 * @author rsen
 */
public class RandomUtils {
    
    /**
     * Random value on the interval [a,b] (inclusively). 'min' must not less than 'max'
     * @param min
     * @param max
     * @return int
     */
    public static int getRandom(int min, int max) {
        return min + new Random().nextInt(max - min + 1);
    }
    
}
