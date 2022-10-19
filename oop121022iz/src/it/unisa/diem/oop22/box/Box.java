package it.unisa.diem.oop22.box;
import it.unisa.diem.oop22.veicoli.Veicolo;

public abstract class Box {
    public final  int maxPosti;
    private String nome;
    
    public Box(int maxPosti, String nome){
            this.maxPosti = maxPosti;
            this.nome = nome;
     }
    
    public abstract void entra(Veicolo v) throws BoxException;
    
    public abstract Veicolo esce() throws BoxException;

    @Override
    public String toString() {
        return "Nome" + nome + " ,  Capienza: " + maxPosti + "\n"; //la virgola per a fianco
    }
}
