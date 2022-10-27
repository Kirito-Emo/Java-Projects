/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop280922iz;

import it.unisa.diem.oop.persone.Studente;

/**
 *
 * @author lucagreco
 */
public class TestStudenti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        
       Studente s1, s2, s3;
       
        
       System.out.println(Studente.getContatore());
       
       s1 = new Studente("061270001", "Mario", "Rossi");
      
       s2 = new Studente("061270002", "Ernesto", "Rossi");
       
       s3 = new Studente("061270003", "Davide", "Rossi");
       
       
       
       
      System.out.println(Studente.getContatore());
       
      /* 
       s1.stampaInfo();
       s2.stampaInfo();
       s3.stampaInfo();
        */    
    }
    
}
