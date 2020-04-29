package com.company.domain;

import java.util.ArrayList;
import java.util.Random;

public
class EquipoEspartano {

    int litros =0;
    ArrayList<Espartano> lista;

    public
    EquipoEspartano (ArrayList<Espartano> lista) {
        this.lista = lista;
    }

    public int consumeCerveza(){

        for (Espartano e: lista ) {
            int vejiga=0;
            while(vejiga<20){
                Random r = new Random();
                int valorDado = r.nextInt(9);

                if(valorDado%2==0){
                   litros += e.beber();
                }
                else{
                    vejiga+= e.orinar();
                }
            }
        }
        return litros;
    }
}
