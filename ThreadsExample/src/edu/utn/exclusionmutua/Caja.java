package edu.utn.exclusionmutua
        ;

class Caja {
    private int valor;
    private boolean disponible = false;

    public synchronized void meter(int nv) {

        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            valor = nv;
            disponible = true;
            notifyAll();
            System.out.println("metido el valor: " + valor);

    }

    public synchronized void sacar() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("sacado el valor: " + valor);
            valor = 0;
            disponible = false;
            notifyAll();

    }
}