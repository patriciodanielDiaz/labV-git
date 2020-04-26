import controller.AutoController;
import domain.Auto;
import model.AutoMemory;
import model.Vehiculo;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("123asd","uno","fiat",10,30,10,"buena" );
        Chapista chapista=new Chapista();
        Mecanico mecanico=new Mecanico();


        AutoMemory vehiculo=new AutoMemory();
        vehiculo.addVehiculo(auto);
        vehiculo.addObserver(chapista);
        vehiculo.addObserver(mecanico);


        AutoController autocontroler=AutoController.getInstance();
        autocontroler.setAutoMemory(vehiculo);
        //autocontroler.cambioEstadoChapas("malo");
        autocontroler.cambioNivelAceite(20);

    }
}
