package it.unisa.diem.oop.developed.group75;

import it.unisa.diem.oop.provided.MobileCPUType;
import java.time.LocalDate;

public  class Smartphone extends Device {
    private  MobileCPUType cpu; 
    private  float screenSizeinch;

    public Smartphone(MobileCPUType cpu, float screenSizeinch, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.cpu = cpu;
        this.screenSizeinch = screenSizeinch;
    }
   
    public MobileCPUType getCpu() {
        return cpu;
    }

    public float getScreenSizeinch() {
        return screenSizeinch;
    }
    
    @Override
    public boolean hasTouchScreen() {
        return true;
    }
    

    @Override
    public String toString() {
        return "Smartphone\n" + super.toString() + "\nCPU= " + cpu + "\nscreenSizeInch= " + screenSizeinch;
    }
}