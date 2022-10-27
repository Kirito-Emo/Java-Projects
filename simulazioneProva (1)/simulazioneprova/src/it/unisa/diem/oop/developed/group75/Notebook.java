package it.unisa.diem.oop.developed.group75;

import it.unisa.diem.oop.provided.CPUType;
import it.unisa.diem.oop.provided.NBScreenType;

public class Notebook extends Device{
    
    private CPUType type;
    private NBScreenType screenType;
    private boolean touchScreen;

    public Notebook(CPUType type, NBScreenType screenType, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.touchScreen = false;
        this.type = type;
        this.screenType = screenType;
    }
    
    public Notebook(CPUType type, NBScreenType screenType, boolean touchScreen, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.touchScreen = touchScreen;
        this.type = type;
        this.screenType = screenType;
    }

    public NBScreenType getScreenType() {
        return screenType;
    }

    public CPUType getType() {
        return type;
    }
    
    @Override
    public boolean hasTouchScreen(){
        return touchScreen;
     }

    @Override
    public String toString() {
        if(hasTouchScreen())
            return  "Notebook\n" + super.toString() + "\nCPU=" + type + "\nscreenType=" + screenType + "\ntouchScreen available";
        else
            return  "Notebook\n" + super.toString() + "\nCPU=" + type + "\nscreenType=" + screenType; //qui la specifica non lo vuole quindi non inseriamo touch screen
    }
}