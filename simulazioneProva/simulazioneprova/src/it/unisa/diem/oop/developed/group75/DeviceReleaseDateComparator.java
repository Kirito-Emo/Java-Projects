package it.unisa.diem.oop.developed.group75;

import java.util.Comparator;

public class DeviceReleaseDateComparator implements Comparator <Device>{
    
    public int compare(Device o1, Device o2){
        
        if(o1.getReleaseDate().isAfter(o2.getReleaseDate()))
            return 1;
        else if(o1.getReleaseDate().isBefore(o2.getReleaseDate()))
            return -1;
        
        return o1.compareTo(o2);
    }
}