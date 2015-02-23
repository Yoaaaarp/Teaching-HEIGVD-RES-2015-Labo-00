/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author David
 */
public abstract class IInstrument {
    public abstract String play();
    public abstract int getSoundVolume();
    public abstract String getColor();
}

class Trumpet extends IInstrument {
    private String sound = "pouet";
    private int volume = 10;
    private String color = "golden";
    
    @Override
    public String play(){
        return sound;
    }
    @Override
    public int getSoundVolume(){
        return volume;
    }
    @Override
    public String getColor(){
        return color;
    }
}

class Flute extends IInstrument {
    private String sound = "Fluuuuuu";
    private int volume = 6;
    private String color = "brown";
    
    @Override
    public String play(){
        return sound;
    }
    @Override
    public int getSoundVolume(){
        return volume;
    }
    @Override
    public String getColor(){
        return color;
    }
}
