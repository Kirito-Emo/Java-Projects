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
/*
uno spazio può essere immaginato come un ambiente in cui entra un numero limitato di persone
senza dargli una caratterizzazione con politiche di accesso, regole ecc, è un concetto troppo generale, definisico  quindi una classe astratta
*/

//troppo generale per poter essere istanziato
// dico che ho una classe astratta cioè non la posso istanziare senza sapere la sua funzione
public  abstract class Spazio {
        public final int  maxPosti;
        private String nome; // nome dello spazio

        public Spazio(int maxPosti, String nome) {
            this.maxPosti = maxPosti;
            this.nome = nome;
        }   
        public abstract void entra(Persona p) throws SpazioException;
        
        public abstract Persona esce() throws SpazioException;

@Override
    public String toString() {
            return "###" + 
           "\n Nome: " + nome + 
           "\nPosti occupabili: " + maxPosti + '\n'; //generalizzato
    }
 //questa classe astratta implementa, entra, ed esce -> la persona ho uno spazio con accesso limitato da parte delle persone che posssono entrare/uscire     
}
