/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spacecraft.model;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;

/**
 * 
 * @author rsen
 */
@XStreamAlias("map")
public class FieldMap {
    @XStreamAsAttribute
    private int width;

    @XStreamAsAttribute
    private int height;

    @XStreamAsAttribute
    private int gravity;
    
    @XStreamAsAttribute
    private int visibility;
    // TODO: weather
//    @XStreamImplicit
    private ArrayList<Corpus> corpuses = new ArrayList<Corpus>();

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
