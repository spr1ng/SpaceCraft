// /*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
package spacecraft.model;
//
//import java.awt.Color;

import spacecraft.model.ai.CorpusAI;
import com.thoughtworks.xstream.annotations.XStreamAlias;
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
@XStreamAlias("corpus")
public class Corpus /*implements Movable, Cloneable*/{
    
    public enum Material {
    
    }
    
    private String id;
    private int height;
    private int width;
    private Material material;
    private int posX;
    private int posY;
    private int posZ; // reserved
    private int hp;
    private int energy;
    private CorpusAI ai;

    public CorpusAI getAi() {
        return ai;
    }

    public void setAi(CorpusAI ai) {
        this.ai = ai;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
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

}
