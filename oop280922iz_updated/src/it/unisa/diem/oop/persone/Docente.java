/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.persone;

/**
 *
 * @author Francesco Quagliuolo
 */
// extends -> eredito da persona
// mi da errore, devo NECESSARIAMENTE istanziare 
public class Docente extends Persona {
      //rispetto a Persona ho solo un attributo in più  
    private String insegnamento; //aggiungo insegnamento come private
    // dovendo istanziare un oggetto della superclasse,il costruttore non comprende solo l'insegnamento ma ha la necessità di passare tutti i parametri della superclasse sposto insegnamento alla fine
    public Docente(String nome, String cognome, String codFiscale, String insegnamento) {
        super(nome, cognome, codFiscale); // Super significa che mi sto rifernedo al costruttore della superclasse, mi serve per poter chiamare la classe principale ereditando nuovi metodi
        this.insegnamento = insegnamento;
    }
      
     // getNome può essere usato purchè sia pubblico o in modalità protected getNome()   
        public String getInsegnamento(){
           return insegnamento;
    }
    public void setInsegnamento(String insegnamento){
            this.insegnamento = insegnamento;
    }

    // devo definire il metodo toString non posso usare l'inserimento automatico ma aggiungo manualmente la nuova caratteristica ovvero insegnamento
    @Override
    public String toString(){
        return super.toString() + "insegnamento: " + insegnamento + '\n';
        //alternativa return getNome() + " insegnamento: " + insegnamento + '\n'; cioè come alternativa prendo solo nome e insegnamento
    }
}

