/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecraft.model;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * @version $Id$
 * @author rsen
 */
public class Wind {
    
    public enum Direction {
        WEST, EAST, NORTH, SOUTH
    }
    
    @XStreamAsAttribute
    private int strength;
    
    @XStreamAsAttribute
    private Direction direction;

    public Wind() {
        direction = Direction.SOUTH;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
}
