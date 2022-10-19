package it.unisa.diem.oop22.box;
import it.unisa.diem.oop22.veicoli.Veicolo;

/**
 *
 * @author emo
 */
public class Autorimessa extends Box {
    
        private Veicolo veicoli[];
        private int testa;
        private int coda;
        private int riemp;
        
        public Autorimessa(int maxPosti, String nome){
            super(maxPosti,nome);
            testa = 0;
            coda = 0;
            riemp = 0;
            veicoli = new Veicolo[maxPosti];
         }
        
        public boolean autorimessaPiena(){
            
            return riemp ==  maxPosti;
        }
        
        public boolean autorimessaVuota(){
            
            return riemp == 0;
            
        }
        
        
        @Override
        public void entra (Veicolo v) throws AutorimessaPienaException, TargaNonValidaException{
                if(autorimessaPiena()) {
                    throw new AutorimessaPienaException("L'autorimessa è piena.");
                }
                if(!v.controllaTarga()) { //ricordare il v.
                    throw new TargaNonValidaException("Targa non valida, ingresso vietato.");
                }
                           
               veicoli [coda] = v;
               coda = (coda + 1) % maxPosti;
               riemp ++;
            
        }
        @Override
        public Veicolo esce() throws AutorimessaVuotaException {
            if(autorimessaVuota()){
                throw new AutorimessaVuotaException("L'autorimessa è vuota.");
            }
            
            Veicolo v = veicoli[testa];
            veicoli[testa] = null;
            riemp --; //accorcio il riempimento
            testa = (testa+1) % maxPosti;
                return v;
        }

        @Override
        public String toString() {
            String s = super.toString() + "Veicoli presenti: \n"; //faccio riferimento alla superclasse to string che si trova in persona
            for( int i = 0; i < riemp; i++) {
                s+= veicoli [(testa + i) % maxPosti].toString();
            }
            return s;
        }
}