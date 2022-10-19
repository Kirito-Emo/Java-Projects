package it.unisa.diem.oop22.veicoli;

public class Autovettura extends Veicolo{
    
    private final int numeroPosti;
    
    public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int numeroPosti){
        super(numTelaio,modello,alimentazione,targa);
        this.numeroPosti = numeroPosti;
    }

    public int getNumeroPosti(){
        return numeroPosti;
    }
    
    /*
    Soluzione alternativa
    publiic boolean controllaTarga(){
        String = super.getTarga();
    
        if((s.length()) !=7){
            return false;
    }
     for(int i = 0; i<7; i++){
        if(i<2 || i>4){
            if(!Character.isLetter(s.charAt(i))){
                return false;
         }   
    }
    else{
        if(!Character.isDigit(s.charAt(i))){
            return false;
        }
    } 
    }
    return false;    
    */
    
    
    @Override
    public boolean controllaTarga() {
      return getTarga().matches("^[A-Z]{2}[0-9]{3}[A-Z]{2}$");
    }

    @Override
    public String toString() {
        return super.toString() + "\nnumeroPosti: " + numeroPosti ; //To change body of generated methods, choose Tools | Templates.
    }
}
