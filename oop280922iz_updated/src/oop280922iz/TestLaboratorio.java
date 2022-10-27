/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop280922iz;

import it.unisa.diem.oop.persone.Studente;
import it.unisa.diem.oop.spazi.Laboratorio;

/**
 *
 * @author Francesco Quagliuolo
 */
public class TestLaboratorio {
    
     public static void main(String[] args) {
        // TODO code application logic here
        
      
        
        
       Studente s1, s2, s3, s4;
 
       
       s1 = new Studente( "Mario", "Rossi","MRRS");
      
       s2 = new Studente( "Ernesto", "Rossi","ERRS");
       
       s3 = new Studente("Davide", "Rossi","DVRSS");
       
       s4 = new Studente("Nicola", "Rossi","NROSS");
       
       Laboratorio l = new Laboratorio(3,"Lab m"); // adesso qui oltre al numero di posti disponibili inseriamo anche il nome del laboatorio perchè la superclasse spazi ha (maxPosti, nome)
       
       l.entra(s1);
       l.entra(s2);
       l.entra(s3);
       l.esce();
       l.entra(s4);
       
       //l.studentiInLaboratorio();
       System.out.println(l);
}
}

// qui avendo ora la classe studente figlia di persona abbiamo che in persona abbiamo aggiunto anche un altro attributo codice fiscale quindi anche nel testLaboratorio dobbiamo andare ad aggiungerlo