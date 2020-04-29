package com.company.domain;

public
class Vikingo extends Human {

    Integer bebedorProfesional;
    Integer capacidad=0;
    Integer litros=0;
    Integer id;

    public
    Vikingo (String name, Integer age, Float weight, IOrinar orinar, IBeber beber, Integer bebedorProfesional) {
        super(name, age, weight, orinar, beber);
        this.bebedorProfesional = bebedorProfesional;
    }
    public Vikingo(){}

    public
    Integer getBebedorProfesional ( ) {
        return bebedorProfesional;
    }

    public
    void setBebedorProfesional (Integer bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
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
    Integer beber ( ) {
        litros=litros +this.beber.beber();

        return litros;
    }

    @Override
    Integer orinar ( ) {
        capacidad=capacidad+this.orinar.orinar()-bebedorProfesional;

        return capacidad;
    }
}
