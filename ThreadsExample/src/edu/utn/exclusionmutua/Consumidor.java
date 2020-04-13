package edu.utn.exclusionmutua;

class Consumidor extends Thread {
    Caja c;

    public Consumidor(Caja nc) {
        c = nc;
    }

    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            c.sacar();
        }
    }
}
