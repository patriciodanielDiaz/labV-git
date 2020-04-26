import model.AutoMemory;

import java.util.Observable;
import java.util.Observer;

public
class Mecanico implements Observer {


    @Override
    public
    void update (Observable o, Object arg) {
        AutoMemory autoMemory = (AutoMemory) o;

        String palabraClave = (String)arg;

        if(palabraClave.substring(0,8).equals("mecanico")){
            System.out.println(arg);}
    }
}
