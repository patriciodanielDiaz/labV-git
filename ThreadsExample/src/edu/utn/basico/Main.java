package edu.utn.basico;

public class Main {

    public static void main(String[] args) {

        SiNoThread siThread = new SiNoThread("SI");
        SiNoThread noThread= new SiNoThread("NO");


        //(CountDownLach) esperarr a todos los hilos

        siThread.start();
        noThread.start();

    }
}
