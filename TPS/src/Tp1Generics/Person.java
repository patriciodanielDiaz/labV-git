package Tp1Generics;

import java.util.Objects;

public
class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;
    private int dni;

    public
    Person (String name, String surname, int dni,int age) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.age=age;
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
    String getSurname ( ) {
        return surname;
    }

    public
    void setSurname (String surname) {
        this.surname = surname;
    }

    public
    int getAge ( ) {
        return age;
    }

    public
    void setAge (int age) {
        this.age = age;
    }

    public
    int getDni ( ) {
        return dni;
    }

    public
    void setDni (int dni) {
        this.dni = dni;
    }

    @Override
    public
    boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;

        return dni == person.dni && this.age == person.age  &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public
    int hashCode ( ) {
        return Objects.hash(dni);
    }

    @Override
    public
    int compareTo (Person o) {

        int r=this.age-o.getAge();

        return r;
    }

    @Override
    public
    String toString ( ) {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", dni=" + dni +
                '}';
    }
}
