package model;

import java.util.Observable;

public
abstract class Vehiculo<T> extends Observable {

        public abstract void addVehiculo(T t);
        public abstract T getVehiculo();
        public abstract void cambioNivelAceite (Integer nuevoNivel);
        public abstract void cambioPresionNeumaticos (Integer nuevoNivel);
        public abstract void cambioNivelAgua (Integer nuevoNivel);
        public abstract void cambioEstadoChapas (String nuevoEstado);

}
