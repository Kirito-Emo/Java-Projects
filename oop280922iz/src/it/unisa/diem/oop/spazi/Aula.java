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
public class Aula extends Spazio {

//    public final int maxPosti; //numero massimo di posti
//    private Studente studenti[]; //array di studenti array di reference
    private Persona persone[];
    private int posizioneLibera;

    public Aula(int maxPosti, String nome) {
        super(maxPosti, nome);
        persone = new Persona[maxPosti];
        posizioneLibera = 0;
        
    }
    
    public boolean aulaVuota(){
        
        return posizioneLibera == 0; //metodo che mi consente di vedere se l'aula è libera con un booleano
    }
    
    public boolean aulaPiena(){
        
        return posizioneLibera == maxPosti; 
    }
    @Override
    public void entra(Persona s) throws AulaPienaException {
        if(aulaPiena()) {
            throw new AulaPienaException("Warning, the room is full.");
            //System.out.println("L'aula è piena.");
            //return;
        }
            persone[posizioneLibera] = s;
            posizioneLibera++;
}
    @Override
    public Persona esce() throws AulaVuotaException {
        if(aulaVuota()) {
            throw new AulaVuotaException("Warning, the room is full.");
            //System.out.println("L'aula è vuota");
            //return null;
        }  
        
        posizioneLibera--;
        /*implementazione con variabile d'appoggio*/
        Persona s = persone[posizioneLibera];
        persone [posizioneLibera] = null;
        return s;
        //return studenti[posizioneLibera];
}
@Override
    public String toString() {
        String s = super.toString() + '\n';
        for( int i = 0; i < posizioneLibera; i++) {
            s+= persone[i].toString() + '\n';
        }

        return s;
    }
}
