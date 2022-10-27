package it.unisa.diem.oop.developed.group75;

import it.unisa.diem.oop.provided.DeviceFilter;

public class NotebookFilter implements DeviceFilter {
    @Override
    public boolean checkDevice(Device d){
        return d instanceof Notebook; //instanceof keyword is a binary operator used to test if an object (instance) is a subtype of a given Type.
    }
}