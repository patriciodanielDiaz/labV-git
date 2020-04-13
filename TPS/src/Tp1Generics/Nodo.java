package Tp1Generics;

public
class Nodo <T> {
    private T data;
    private Nodo<T> next;
    //-------construc-----------

    public  Nodo(T data) {
        this.data = data;
    }
    //-----getter and setter----------
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

}
