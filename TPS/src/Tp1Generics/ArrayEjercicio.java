package Tp1Generics;

public class ArrayEjercicio<E extends Comparable> {

    private E[] list;
    private int size=0;

    public
    ArrayEjercicio (E[] list) {

        this.list = list;
        this.size=size;
    }

    public E max(){

        E e = null;
        if(this.list.length != 0){

            e=this.list[0];
            for(int i=1;i<this.list.length;i++){

                int v=this.list[i].compareTo(e);

                if(v>0) e=this.list[i];
            }
        }

        return e;
    }
    public E min(){

        E e = null;
        if(this.list.length != 0){

            e=this.list[0];
            for(int i=1;i<this.list.length;i++){

                int v=this.list[i].compareTo(e);

                if(v<0) e=this.list[i];
            }
        }

        return e;
    }
    public boolean exist(E e){

        boolean flag = false;

        for(int i=0 ; i < this.list.length ; i++){

            flag = this.list[i].equals(e);
            if (flag) return flag;
        }

        return flag;
    }
    public void show(){

        for(int i=0 ; i < this.list.length ; i++){

            System.out.println("------------------------------------");
            System.out.println(this.list[i].toString());

        }
    }
    //ejercicio 2 -------------no funciona
    public E remove(){

        E r =null;
        E[] auxList;

        if ( this.list.length>0) {

            int i = this.list.length;
            r = this.list[i - 1];
            /*this.list[i - 1] = null;

            //switch to a new array
            for(int y=0;y<this.list.length-1; y++){
                E el=this.list[y];
                auxList [y] = {el};
            */

            }

        //this.list=auxList;
        return r;
    }

}

