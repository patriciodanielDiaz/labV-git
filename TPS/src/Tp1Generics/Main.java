package Tp1Generics;

public class Main {

    public static void main(String[] args){

        //---------------ejercicio 1 - 2------------------------------------------------------------------
        Person p1 =new Person("patricio","Diaz",385502,33);
        Person p2 =new Person("juan","Perez",4115502,47);
        Person p3 =new Person("miguel","Lopez",21185502,17);
        //Person p4 =new Person("mi","pez",25502,97);

        Person [] lista ={p1,p2,p3};

        ArrayEjercicio<Person> prueba = new ArrayEjercicio<>(lista);

        //prueba.show();
        //System.out.println( prueba.remove());
        prueba.remove();
        prueba.show();

        //---------------ejercicio3------------------------------------------------------------------
        /*MyStack<String> myStack = new MyStack<String>();

        myStack.push("uno");
        myStack.push("dos");
        myStack.push("tres");

        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        */
    }
}
