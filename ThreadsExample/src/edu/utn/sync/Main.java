package edu.utn.sync;

public class Main {

    public static void main(String[] args) {

        SiNoThread siThread = new SiNoThread("SI");
        SiNoThread noThread= new SiNoThread("NO");
        siThread.start();
        noThread.start();


    }
}
