/*
La classe DeviceStore implementa l’interfaccia Filterable (già fornita) e definisce l’entità magazzino (store) 
come un insieme di dispositivi di elaborazione (Device). La struttura dati scelta per l’implementazione dello 
store dovrà consentire la visualizzazione degli elementi secondo la relazione d’ordine naturale prevista per i 
Device o secondo una relazione d’ordine specificata da un comparatore passato come parametro al 
costruttore.
La classe deve prevedere una proprietà name (String) che rappresenta il nome dello store, passato come 
parametro al costruttore
*/
package it.unisa.diem.oop.developed.group75;

import it.unisa.diem.oop.provided.DeviceFilter;
import it.unisa.diem.oop.provided.Filterable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeviceStore implements Filterable{

    private String name;
    private Set<Device> store;

    public DeviceStore(String name) {
        this.name = name;
        this.store = new TreeSet<>();
    }

    public DeviceStore(String name, Comparator <Device> c) {
        this.name = name;
        this.store = new TreeSet<>(c);
    }
    
    public DeviceStore filter(DeviceFilter d, Comparator<Device> c) {
            
        DeviceStore filteredStore = new DeviceStore(this.name, c);
            
        for(Device device : this.store){
            if(d.checkDevice(device)){
                try {
                    filteredStore.addDevice(device);
                } catch (DeviceInsertionException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        return filteredStore;
    }
    
    public void addDevice(Device d) throws DeviceInsertionException { 
        if(this.store.contains(d))
            throw new DeviceInsertionException();
        this.store.add(d);
       }

    @Override
    public String toString() {
        String s = super.toString() + "\n" + this.name + " contains " + this.store.size() + " items.\n" + "Printing: \n";
        for(Device device : this.store){
            s += "\n*****\n" + device.toString();
        }
        
        return s;
    }
}