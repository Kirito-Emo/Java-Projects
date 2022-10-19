package it.unisa.diem.oop22.veicoli;
import it.unisa.diem.oop22.box.TargaNonValidaException;

/**
 *
 * @author emo
 */
public  abstract class Veicolo {
    
    private String numTelaio;
    private String modello;
    private String alimentazione;
    private String targa;

    public Veicolo(String numTelaio, String modello, String alimentazione, String targa){
        this.numTelaio = numTelaio;
        this.modello = modello;
        this.alimentazione = alimentazione;
        this.targa = targa;
    }
    
    public String getnumTelaio(){
        return numTelaio;
    }    

    public String getModello() {
        return modello;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
    
    public abstract boolean controllaTarga() throws TargaNonValidaException;

    @Override
    public String toString() {
        return "***\n" +
        "\nTelaio: " + numTelaio +
        "\nAlimentazione: " + alimentazione +
        "\nTarga: " + targa;        
    }
    
 }
