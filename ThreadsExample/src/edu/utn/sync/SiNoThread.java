package edu.utn.sync;

public class SiNoThread extends Thread {

    static Integer Contador = 0;
    public String nombre;

    public SiNoThread(String s) {
        super();
        nombre = s;
    }

    public void run() {
        int i;

        for (i = 1; i <= 20; i++) {
            synchronized (Contador) {
                System.out.println(++Contador + ":" + nombre + " ");
            }
        }
    }
}
