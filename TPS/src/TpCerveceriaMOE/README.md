# TP CERVECERIA

### Cuantos consumidores se necesitan para que el stock lleghe a 0.

No importa cuantos cunsumidores tenga, si el stock llega a 0 se ejecuta el método wait() para hacer una pausa.

### bloques synchronized.

La palabra reservada synchronized se usa para indicar que ciertas partes del código, (habitualmente, una función miembro) están sincronizadas, es decir, que solamente un hilo puede acceder a dicho método a la vez

### Explica el recurso compartido.

Zonas de memoria comunes desde distintos threads que se ejecutan concurrentemente no debe de ser accedido por mas de un hilo en ejecución

### Explica las 3 formas de instanciar un Thred.

##### Heredar de Thread redefiniendo el método run().

    public class EjemploHilo extends Thread  
    {      
        public void run()() 
        {
            // Código del hilo      
        }  
    }
    //-----------------------------------
    Thread t = new EjemploHilo();
    t.start();

#### Crear una clase que implemente la interfaz Runnable que nos obliga a definir el método run().

    public class EjemploHilo implements Runnable
    {
        public void run() 
        {          
            // Código del hilo      
        }  
    }
    //-------------------------------------
    Thread t = new Thread(new EjemploHilo());  
    t.start();

#### Instanciando un hilo vacio

    Thread t1 = new Thread();
