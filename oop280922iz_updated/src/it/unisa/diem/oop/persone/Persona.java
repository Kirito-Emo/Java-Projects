/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.persone;

/**
 *
 * @author Francesco Quagliuolo
 */
//modificatore protected, attributo visibile nel package non visibile all'esterno del  package.
public class Persona {
    private String nome;
    private String cognome;
    private String codFiscale; //parametro unico per distinguer le persone

    //protected String codFiscale -> l'attributo è visibile nel pacage non lo è fuori: se andassi nella classe studente  con un eventuale legame     
    public Persona (String nome, String  cognome, String codFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codFiscale = codFiscale;
    }

    public String getNome(){
        return nome;
    }
    
    public String getCognome(){
        return cognome;
    }
    
    public String getCodFiscale() {
    return codFiscale;
}
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
} 
//inserendo queta parola chiave faccio un controllo per vedere se ho inserito il nome del metodo in  maniera corretta

@Override
public String toString() {
       //importante la presentazione dell'output
        return "***\n" +
                "Nome: " + nome + 
                "\nCognome: " + cognome + 
                "\nCodice Fiscale: " + codFiscale + "\n";
        
}

//ora voglio adeguare a questa rappresentazione delle sottoclassi, parto definendo una nuova classe: introducendo una nuova classe, ovvero il docente, eredita tutti gli attributi e metodi di persona e aggiunge un insegnamento
// inserisco in package persona la nuova classe docente


    
}


