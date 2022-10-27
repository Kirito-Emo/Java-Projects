/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.persone;

/**
 *
 * @author lucagreco
 */
public class Studente extends Persona {
    //rimuovo gli attributi -> studente deve estendere persona
    private String matricola;
    private static int contatore = 0;
    
    public Studente (String nome, String cognome, String codFiscale, String matricola) {
        super(nome,cognome, codFiscale);
        this.matricola = matricola;
        contatore++;
    }
   //lo modifico esempio di overloading dei metodi inserisco il codice fiscale manualmente.
    public Studente( String nome, String cognome, String codFiscale) {
            this( nome, cognome, codFiscale, "0612700" +contatore); //cambio l'ordine per mantenere la formattazione
    }
    /*
    public Studente(String nome, String cognome){
        this("06127000" + contatore, nome, cognome);
    }
    */
    public static int getContatore() { 
    
        return contatore;
    
    }
    

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String m) {
        matricola = m;
    }
/*
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
  */  
       
    /*
    public void stampaInfo() {
    
        System.out.println("***");
        
        System.out.print("Nome: ");
        System.out.println(nome);
        
        System.out.print("Cognome: ");
        System.out.println(cognome);
        
        System.out.print("Matricola: ");
        System.out.println(matricola);
    
    }
    */
    
        @Override
        public String toString() {
                return super.toString() + "Matricola: " + matricola + "\n";
        }
    
    
}
