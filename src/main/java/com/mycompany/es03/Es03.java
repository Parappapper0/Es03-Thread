package com.mycompany.es03;

public class Es03 {

    public static void main(String[] args) {
        
        int n = 5, k = 3;
        float risultato;
        
        Fattoriale f1 = new Fattoriale(n);
        Fattoriale f2 = new Fattoriale(k);
        Fattoriale f3 = new Fattoriale(n-k);
        
        f1.start();
        f2.start();
        f3.start();
        
        try {
            f1.join();
            f2.join();
            f3.join();
        } catch (InterruptedException e) { System.out.println("Errore: Thread è stato interrotto"); }
        
        risultato = f1.getVal() / (f2.getVal() * f3.getVal());
        
        System.out.println("Risultato: " + risultato);
    }
}
