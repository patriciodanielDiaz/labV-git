package edu.utn.basico;

public class SiNoThread extends Thread {

    static int Contador = 0;
    public String nombre;

    public SiNoThread(String s) {
        super();
        nombre = s;
    }

    public void run() {
        int i;

        //seccion critica
        for (i = 1; i <= 100; i++) {

            System.out.println(++Contador + ":" + nombre + " ");
        }
    }
}
