package edu.utn.synccaja;

class Caja {
    private int valor;

    public synchronized void meter(int nv) {
        valor = nv;
        System.out.println("metido el valor: " + valor);
    }

    public synchronized void sacar() {
        System.out.println("sacado el valor: " + valor);
        valor = 0;
    }
}