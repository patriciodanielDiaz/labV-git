package Tp1Generics;

public
class MyStack<E> {

    Nodo<E> end=null;
    int size=0;

    public void push(E n){

        Nodo <E> newNodo = new Nodo<E> (n);
        if (end==null){
            end=newNodo;
        }
        else{
            newNodo.setNext(end);
            this.end=newNodo;
        }
        size++;

    }
    public E pop(){

        if(end==null){
            return null;
        }
        E r=this.end.getData();
        this.end=this.end.getNext();
        this.size--;
        return r;
    }
    public int size(){
        return this.size;
    }
}
