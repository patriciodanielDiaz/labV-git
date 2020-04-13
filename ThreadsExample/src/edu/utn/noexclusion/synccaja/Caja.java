package edu.utn.noexclusion.synccaja;

class Caja {
    private int valor;
    private boolean disponible = false;

    public synchronized void meter(int nv) {

        if (!disponible) {
            valor = nv;
            disponible = true;
            System.out.println("metido el valor: " + valor);
        }
    }

    public synchronized void sacar() {
        if (disponible) {
            System.out.println("sacado el valor: " + valor);
            valor = 0;
            disponible = false;
        }
    }
}