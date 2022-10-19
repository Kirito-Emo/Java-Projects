package it.unisa.diem.oop22.veicoli;

public class Camion extends Veicolo {
    
    private final int numeroAssi;
    
    public Camion(String numTelaio, String modello, String alimentazione, String targa, int numeroAssi){
        super(numTelaio,modello,alimentazione,targa);
        this.numeroAssi = numeroAssi;
    }

    public int getNumeroAssi() {
        return numeroAssi;
    }

 @Override
    public boolean controllaTarga() {
        return getTarga().matches("^[A-Z]{2}[0-9]{6}$"); //non bisogna mettere gli spazi assolutamente
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n numeroAssi: " + numeroAssi; //To change body of generated methods, choose Tools | Templates.
    } 
}
