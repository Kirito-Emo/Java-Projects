package it.unisa.diem.oop.developed.group75;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Device implements Comparable<Device>{

    private String serialNumber;
    private LocalDate releaseDate;
    private int  RAMsize;
    private int  storageCapacity;

    public Device(String serialNumber, int year, int month , int dayOfMonth, int RAMsize, int storageCapacity) {
        this.serialNumber = serialNumber;
        this.releaseDate.of(year, month , dayOfMonth);
        this.RAMsize = RAMsize;
        this.storageCapacity = storageCapacity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    
    public int getStorageCapacity() {
        return storageCapacity;
    }

        
    public int getRAMsize() {
        return RAMsize;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.serialNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Device other = (Device) obj;
        if (!Objects.equals(this.serialNumber.toLowerCase(), other.serialNumber.toLowerCase())) { //rendiamo tutto piccolo così da non avere problemi
            return false;
        }
        return true;
    }
    
    public abstract boolean hasTouchScreen();
    
    @Override
    public final int compareTo(Device o){
        return this.getSerialNumber().toLowerCase().compareTo(o.getSerialNumber().toLowerCase());
    }

    @Override
    public String toString() {
        return   "serialNumber=" + serialNumber + " \nreleaseDate=" + releaseDate + " \nRAMsize=" + RAMsize + " \nstorageCapacity=" + storageCapacity;
    }
}