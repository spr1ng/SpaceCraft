// /*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
package spacecraft.model.field;
//
//import java.awt.Color;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

//import shipcraft.model.missile.Missile;
//import shipcraft.intrfc.CorpusAI;
//import shipcraft.intrfc.Movable;
//import static shipcraft.utils.Utils.*;
//
//
///**
// * @version $Id: Corpus.java 76 2010-06-23 02:05:43Z spr1ng $
// * @author spr1ng
// */
@XStreamAlias("body")
public class Body /*implements Movable, Cloneable*/{
    
    public enum Material {
        LIGHT, HEAVY
    }
    
    @XStreamAsAttribute
    private int height;
    
    @XStreamAsAttribute
    private int width;
    
    @XStreamAsAttribute
    private float mass;
    
    @XStreamAsAttribute
    private Material material;
    
    @XStreamAsAttribute
    private float posX;
    
    @XStreamAsAttribute
    private float posY;
    
    @XStreamAsAttribute
    private float posZ; // reserved
    
    @XStreamAsAttribute
    private float hp;
    
    @XStreamAsAttribute
    private float energy;
    
    @XStreamAsAttribute
    private float impulseEnergy;
    
    @XStreamAsAttribute
    private float maxSpeed;
    
    @XStreamAsAttribute
    private boolean hasGravityResistance;
    
    @XStreamAsAttribute
    private float nextGravityDx;
    
    public Body(float posX, float posxY, float mass, float energy) {
        this.posX = posX;
        this.posY = posxY;
        this.mass = mass;
        setEnergy(energy);
        impulseEnergy = -1;
        hp = 100;
        maxSpeed = 6;
        nextGravityDx = -1;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getPosZ() {
        return posZ;
    }

    public void setPosZ(float posZ) {
        this.posZ = posZ;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

//
//    //Клонирование корпуса
//    @Override
//    protected Object clone(){
//        try {
//            return super.clone();
//        } catch (CloneNotSupportedException ex) {return null;}
//    }
//

    public float getMass() {
        return mass > 0 ? mass : 0.1f;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }
    
    public void move(float dx, float dy) {
        if (energy > 0 || hasGravityResistance) {
            // Energy move
            posX += dx;
            posY += dy;
            setEnergy(energy);
        } else {
            // Gravity move
            if (nextGravityDx < 0) {
                if (impulseEnergy < 11) {
                    nextGravityDx = dx;
                } else if (impulseEnergy < 101) {
                    nextGravityDx = dx < 0 ? (dx - 1) : (dx + 1);
                } else {
                    nextGravityDx = dx < 0 ? (dx - 2) : (dx + 2);
                }
                posX += nextGravityDx;
                posY += dy;
            }
            System.out.println("[~] Gravity move performed.");
        }
        
    }

    public float getEnergy() {
        return energy;
    }

    public final void setEnergy(float energy) {
        if (energy < 0) energy = 0;
        this.energy = energy;
        if (impulseEnergy < 0) {
            impulseEnergy = energy;
        }
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

}
