package com.company.domain;

public
class Espartano  extends Human {

    Integer id;
    Integer toleranciaExtra;
    Integer capacidad=0;
    Integer litros=0;

    public
    Espartano (String name, Integer age, Float weight, IOrinar orinar, IBeber beber, Integer toleranciaExtra) {
        super(name, age, weight, orinar, beber);
        this.toleranciaExtra = toleranciaExtra;
    }
    public Espartano(){}

    public
    Integer getToleranciaExtra ( ) {
        return toleranciaExtra;
    }

    public
    void setToleranciaExtra (Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }


    public
    Integer getId ( ) {
        return id;
    }

    public
    void setId (Integer id) {
        this.id = id;
    }
    public Integer getLitros(){return litros;}

    @Override
    Integer  beber ( ) {

        litros=litros +this.beber.beber();

        return litros;
    }

    @Override
    Integer orinar ( ) {

        capacidad=capacidad+this.orinar.orinar()-toleranciaExtra;

        return capacidad;
    }

}
