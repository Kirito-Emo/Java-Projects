/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.spazi;
import it.unisa.diem.oop.persone.Persona;

/**
 *
 * @author Francesco Quagliuolo
 */
//la classe laboratorio è simile all'aula ma ha delle differenze dal punto di vista della gestione ingressi uscite
//le persone entrano ed escono allo stesso ordine
public class Laboratorio extends Spazio {

   private Persona persone[]; //importo la classe studenti, se non specifico nessun modificatore è di default
   private int testa;
   private int coda;
   private int riemp;

    public Laboratorio(int maxPosti, String nome) {
        super (maxPosti, nome); // in questo modo io sottoclasse mi sto riferendo alla classe parent spazio e la richiamo con super prendendo i posti ed il nome
        testa = 0;
        coda = 0;
        riemp = 0;
        
        persone = new Persona[maxPosti];
    }
    
    public boolean laboratorioVuoto(){
        
        return riemp == 0;
    }

    public boolean laboratorioPieno(){
    
        return riemp == maxPosti;   
    }
    @Override
    public void entra(Persona s){
        if(laboratorioPieno()) {
            System.out.println("Il laboratorio è pieno.");
            return;
        }
        persone [coda] = s;
        coda = (coda+1) % maxPosti;
        riemp++;
                
    }
    @Override
    public Persona esce(){
        if(laboratorioVuoto()){
            System.out.println("Il laboratorio è vuoto.");
            return null;
        } 
        
        Persona s = persone[testa];
        persone[testa] = null;
        riemp --; //accorcio il riempimento
        
        testa = (testa+1) % maxPosti;
        return s;
    }

    @Override
    public String toString() {
        String s = super.toString() + '\n'; //faccio riferimento alla superclasse to string che si trova in persona
        for( int i = 0; i < riemp; i++) {
            s+= persone [(testa + i) % maxPosti].toString();
        }
        return s;
    }
    
}