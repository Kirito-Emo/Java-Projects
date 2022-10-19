package oop121022iz; 
import it.unisa.diem.oop22.veicoli.Camion;
import it.unisa.diem.oop22.box.Autorimessa;
import it.unisa.diem.oop22.veicoli.Autovettura;
import it.unisa.diem.oop22.veicoli.Moto;
    import it.unisa.diem.oop22.box.BoxException;
    //import it.unisa.diem.oop22.box.AutorimessaPienaException;
    //import it.unisa.diem.oop22.box.AutorimessaVuotaException;
    //import it.unisa.diem.oop22.box.TargaNonValidaException;
  
public class TestRimessa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autorimessa a = new Autorimessa(5,"Parcheggio E1");
        
        try{
            a.entra(new Camion("sdf244", "Fiat CX45", "Gasolio", "TT656671", 4));
            a.entra(new Camion("spl265", "Volvo PTG", "Gasolio", "YH96671", 6));
            a.entra(new Autovettura("mk23t", "Fiat Punto", "Metano", "EA566FM", 5));
            a.entra( new Autovettura("cgt612", "Fiat Idea", "Gasolio", "AQ9Y17UUU", 5));
            a.entra(new Moto("das7896", "Honda Hornet", "Benzina", "AT51233", false));
            a.entra(new Moto("gdt7896", "Suzuki Bandit", "Benzina", "AT5123N", false));
        } catch (BoxException ex) {
            ex.printStackTrace();
        }
        finally{
            System.out.println(a);
        }
    }
}