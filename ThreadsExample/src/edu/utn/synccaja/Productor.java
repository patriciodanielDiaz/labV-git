package edu.utn.synccaja;

class Productor extends Thread {
    Caja c;

    public Productor(Caja nc) {
        c = nc;
    }

    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            c.meter(i);
        }
    }
}
