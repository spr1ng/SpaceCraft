/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spacecraft.model;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;

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

    /** Gravity influencies on the trajectory of a moving corpus */
    @XStreamAsAttribute
    private int gravity;
    
    /** The number of cells visible to the corpus(ship??) in each of the directions */
    @XStreamAsAttribute
    private int visibility;
    
    private Weather weather;
    
    private ArrayList<Corpus> corpuses = new ArrayList<Corpus>();

    public FieldMap() {
        weather = new Weather(new Wind(), 25, 50);
    }

    public ArrayList<Corpus> getCorpuses() {
        return corpuses;
    }

    public void setCorpuses(ArrayList<Corpus> corpuses) {
        this.corpuses = corpuses;
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

    public static void main(String[] args) {
        FieldMap map = new FieldMap();
        map.setGravity(1);
        Corpus corpus = new Corpus();
        corpus.setId("Rock");
        map.corpuses.add(corpus);

        XStream xStream = new XStream(new DomDriver());
        xStream.autodetectAnnotations(true);
        System.out.println(xStream.toXML(map));
    }

}
