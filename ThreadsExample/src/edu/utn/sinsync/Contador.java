package edu.utn.sinsync;

class Contador {
    private long valor = 0;

    //syncronized deje entrar a un proceso termina y entra el otro ,no se pisan
    public synchronized void incrementa() {
        //seccion critica
        long aux;
        aux = valor;
        aux++;
        valor = aux;
    }

    public  long getValor() {
        return valor;
    }
}
