/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop280922iz;

import it.unisa.diem.oop.persone.Docente;
import it.unisa.diem.oop.persone.Persona;
import it.unisa.diem.oop.persone.Studente;
import it.unisa.diem.oop.spazi.AulaPienaException;
import it.unisa.diem.oop.spazi.AulaVuotaException;

/**
 *
 * @author Francesco Quagliuolo
 */
public class TestPersona {
    /**
     * @param args
     */
    public static void main (String[] args) {
        
        Persona p = new Persona ("Mario", "Rossi", "MRRSS01"); //importo perchè è dentro un altro package
        // ogni oggetto ha la sua rappresentazione come stringa
        // in java tutte le nuove classi che vado a definire sono sottoclassi di un oggetto
        System.out.println(p.toString()); // posso subito stampare la rappresentazione dell'oggetto, la println accetta una rappresentazione, come ho detto è un polimorfismo
        //per questo reference esiste già una rappresentazione come stringa e potevo scrivere println(p)
        //se vado in run , non avendo specificato come definire il metodo viene rappresentata in default la rappresentazione di tipo 
        // non avendo inizializzato toString mi da la rappresentazione in stringa di default di questo oggetto, non mi usa il metodo
        Docente d = new Docente ("Paolo", "Rossi", "PRRSS02", "OOP");
        System.out.println(d);  // non mi esce l'insegnamento -> lo stesso di object, se non definisco il to string in classe docente, eredito quello di persona
        Studente s = new Studente("Ernesto", "Rossi", "ERRS03"); 
        System.out.println(s);
        Persona s1 = new Studente("Stefano", "Rossi", "ERRSS03");
        Persona s2 = new Studente("Luigi", "Rossi", "ERRSS03"); 
        
        //se io istanzio una sottoclasse (Studente) come superclasse sto effettuando un operazione di UPCASTING, saranno usati solamente i metodi di Persona nel caso in esame e non quelli di studente
        Persona p1 = new Studente("Studente 1", "Studente Upcast", "STDUP09G");
        System.out.println(p1);
        // per la questione del latebinding ovvero in questo caso viene recuperato il metodo implementato in Studente e non quello in persona
        //lLateBinding or dynamic binding -> il compilatore non decide il metodo che deve essere chiamato, overriding è un esempio ottimo di ciò, dove sia la classe padre che la classe figlio hanno lo stesso metodo (processo a run-time)
        //in questo caso  viene recuperato il metodo implementato in studente non quello in persona (override) usa il toString di Studente mostrando anche la matricola
        // mentre non potremmo usare metodi che sono definiti in studente e non in persona come ad esempio getMatricola che ci darebbe errore
        
        Aula a = new Aula(3, "Aula M");

        try {
            a.entra(p);
            a.entra(d);
            a.entra(s);
            a.esce();
            a.entra(s1);
            a.entra(s2);
        } catch (AulaPienaException | AulaVuotaException ex) {  //oppure più generalmente catch (SpazioException ex)
            ex.printStackTrace();
        }
    }
}

/*
nel caso generale toString (ereditato dalla classe genereale object) restituisce
- una stringa del tipo 'nomeClasee@hexcode'
- hexcode è la rappresentazione esadecimale della classe (con attributi etc)
- per la classe toString  in genere viene fatto quindi un override cosi da ottenere una stringa con informazioni più rilevanti
*/
