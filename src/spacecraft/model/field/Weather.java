/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecraft.model.field;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * @version $Id$
 * @author rsen
 */
public class Weather {
    
    /** Influencies on trajectory */
    private Wind wind;
    
    /** Influencies on body weight and energy consumption */
    @XStreamAsAttribute
    private int temperature;
    
    /** Depends on humidity */
    @XStreamAsAttribute
    private int humidity;

    public Weather(Wind wind, int temperature, int humidity) {
        this.wind = wind;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
    
}
