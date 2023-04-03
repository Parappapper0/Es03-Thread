package com.mycompany.es03;

public class Fattoriale extends Thread {
    private int val;

    public int getVal() {
        return val;
    }
    
    public Fattoriale(int val) {
        this.val = val;
    }
    
    @Override
    public void run() {
        val = fattoriale(val);
    }
    
    private int fattoriale(int v) {
        if(v == 1) return 1;
        return v * fattoriale(v-1);
    }
}
