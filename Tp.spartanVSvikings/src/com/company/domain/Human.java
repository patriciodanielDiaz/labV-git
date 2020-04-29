package com.company.domain;

public abstract
class Human {

    Integer idHumano;
    String name;
    Integer age;
    Float weight;
    IOrinar orinar;
    IBeber beber;

    public
    Human (String name, Integer age, Float weight, IOrinar orinar, IBeber beber) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.orinar = orinar;
        this.beber = beber;
    }

    public
    Human ( ) {
    }

    public
    String getName ( ) {
        return name;
    }

    public
    void setName (String name) {
        this.name = name;
    }

    public
    Integer getAge ( ) {
        return age;
    }

    public
    void setAge (Integer age) {
        this.age = age;
    }

    public
    Float getWeight ( ) {
        return weight;
    }

    public
    void setWeight (Float weight) {
        this.weight = weight;
    }

    public
    IOrinar getOrinar ( ) {
        return orinar;
    }

    public
    void setOrinar (IOrinar orinar) {
        this.orinar = orinar;
    }

    public
    IBeber getBeber ( ) {
        return beber;
    }

    public
    void setBeber (IBeber beber) {
        this.beber = beber;
    }

    public
    Integer getIdHumano ( ) {
        return idHumano;
    }

    public
    void setIdHumano (Integer idHumano) {
        this.idHumano = idHumano;
    }

    abstract Integer beber();
    abstract Integer orinar();
}
