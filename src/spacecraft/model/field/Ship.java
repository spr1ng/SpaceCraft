/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecraft.model.field;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import spacecraft.behaviour.Intelligent;
import spacecraft.behaviour.Skinnable;
import spacecraft.model.Action;
import spacecraft.model.ai.AI;

/**
 * @version $Id$
 * @author rsen
 */
@XStreamAlias("ship")
public class Ship extends Body implements Intelligent, Skinnable {
    
    @XStreamAsAttribute
    private String name;

    public Ship(float posX, float posxY, float mass, float energy) {
        super(posX, posxY, mass, energy);
    }
    
    public Skin getSkin() {
        return Skin.SHIP;
    }

    public AI getAi() {
        return new AI() {
            public Action getAction(FieldMap fieldMap) {
                return new Action();
            }
        };
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
