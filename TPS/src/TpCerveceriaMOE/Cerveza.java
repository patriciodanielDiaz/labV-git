package TpCerveceriaMOE;

public
class Cerveza {

    int id;
    static int numero=0;
    private String nombre;

    public
    Cerveza (String nombre) {
        this.nombre = nombre;
        numero=numero+1;
        id=numero;
    }

    public
    String getNombre ( ) {
        return nombre;
    }

    public
    void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public
    int getId ( ) {
        return id;
    }

}
