/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spacecraft.model.field;

import java.util.ArrayList;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * @version $Id$
 * @author rsen
 */
@XStreamAlias("map")
public class FieldMap {
    
    /** Max OX value */
    @XStreamAsAttribute
    private int maxX;

    /** Max OY value */
    @XStreamAsAttribute
    private int maxY;
    
    /** Reserved for the future purposes */
    @XStreamAsAttribute @XStreamOmitField
    private int maxZ;

    /** Gravity influences on the trajectory of a moving body */
    @XStreamAsAttribute
    private int gravity;
    
    /** The number of cells visible to the body(ship??) in each of the directions */
    @XStreamAsAttribute
    private int visibility;
    
    private Weather weather;
    
    private ArrayList<Body> bodies = new ArrayList<Body>();

    public FieldMap() {
        weather = new Weather(new Wind(), 25, 50);
    }

    public ArrayList<Body> getBodies() {
        return bodies;
    }

    public void setBody(ArrayList<Body> bodies) {
        this.bodies = bodies;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public int getMaxZ() {
        return maxZ;
    }

    public void setMaxZ(int maxZ) {
        this.maxZ = maxZ;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

}
