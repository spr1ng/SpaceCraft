/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecraft.manager;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import spacecraft.model.field.Body;
import spacecraft.model.field.FieldMap;
import spacecraft.model.field.Ship;

/**
 * @version $Id$
 * @author rsen
 */
public class GameManager {
    
    public void moveBody(Body body, float dx, float dy) {
        // 1. How long the remaining way (streight distance without gravity influence)
        // s = e /m
        float s = body.getEnergy() / body.getMass();
        System.out.println("[~] Distance total: " + s);
        
        float maxSpeed = body.getMaxSpeed();
        if (s > maxSpeed) {
            s = maxSpeed;
        }
        System.out.println("[~] Distance (current, by speed): " + s);
        
        for (int i = 0; i < s; i++) {
            body.move(dx, dy);
            System.out.println("[~] (" + body.getPosX() + ";" + body.getPosY() + ")");
        }
    }
    
    public static void main(String[] args) {
        FieldMap map = new FieldMap();
        map.setGravity(1);
        Ship ship = new Ship(2, 2, 10, 10);
        ship.setName("A Hackish Rock");
        map.getBodies().add(ship);

        XStream xStream = new XStream(new DomDriver());
        xStream.autodetectAnnotations(true);
        System.out.println(xStream.toXML(map));
        
        GameManager gm = new GameManager();
        for (int i = 0; i < 10; i++) {
            gm.moveBody(ship, 1, 1);
        }
    }
    
}
