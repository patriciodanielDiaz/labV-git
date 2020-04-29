package com.company.domain;

import java.util.ArrayList;
import java.util.Random;

public
class EquipoVikingo {

    int litros =0;
    ArrayList<Vikingo> lista;

    public
    EquipoVikingo (ArrayList<Vikingo> lista) {
        this.lista = lista;
    }

    public int consumeCerveza(){

        for (Vikingo v: lista ) {
            int vejiga=0;
            while(vejiga<20){
                Random r = new Random();
                int valorDado = r.nextInt(9);

                if(valorDado%2==0){
                    litros += v.beber();
                }
                else{
                    vejiga += v.orinar();
                }
            }
        }
        return litros;
    }
}
