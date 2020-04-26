package model;

import domain.Auto;
import model.Vehiculo;

public
class AutoMemory extends Vehiculo<Auto> {

    private Auto auto;

    @Override
    public
    void addVehiculo (Auto auto) {
        this.auto=auto;
    }

    @Override
    public
    Auto getVehiculo () {
        return auto;
    }

    @Override
    public
    void cambioNivelAceite (Integer nuevoNivel) {

        int nivelViejo=auto.getNivelAceite();
        auto.setNivelAceite(nuevoNivel);
        setChanged();
        notifyObservers("mecanico nivel aceite = "+nivelViejo+" , "+auto.getNivelAceite() );
    }

    @Override
    public
    void cambioPresionNeumaticos (Integer nuevaPresion) {
        int presionViejo=auto.getPresionNeumaticos();
        auto.setPresionNeumaticos(nuevaPresion);
        setChanged();
        notifyObservers("mecanico presion neumaticos = "+presionViejo+" , "+auto.getPresionNeumaticos() );
    }

    @Override
    public
    void cambioNivelAgua (Integer nuevoNivel) {

            int nivelViejo=auto.getNivelAgua();
            auto.setNivelAgua(nuevoNivel);
            setChanged();
            notifyObservers("mecanico nivel agua = "+nivelViejo+" , "+auto.getNivelAgua() );
    }

    @Override
    public
    void cambioEstadoChapas (String nuevoEstado) {

            String estadoViejo= auto.getEstadoCarroceria();

            auto.setEstadoCarroceria(nuevoEstado);
            setChanged();
            notifyObservers("chapista = "+estadoViejo +" , "+auto.getEstadoCarroceria() );
    }


}
