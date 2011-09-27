/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecraft.behaviour;

/**
 * @version $Id$
 * @author rsen
 */
public interface Skinnable {
    
    enum Skin {
        ROCK, SUN, SHIP, MISSILE
    }
    
    Skin getSkin();
    
}
