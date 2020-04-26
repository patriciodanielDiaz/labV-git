package controller;

import model.AutoMemory;

public
class AutoController {

    private static AutoController instance;
    private AutoMemory autoMemory;

    private AutoController(){

    }

    public static AutoController getInstance(){
        if (instance == null) instance =new AutoController();
        return instance;
    }

    public
    void setAutoMemory (AutoMemory autoMemory) {
        this.autoMemory = autoMemory;
    }

    public
    void cambioNivelAceite (Integer nuevoNivel) {
        this.autoMemory.cambioNivelAceite(nuevoNivel);
    }

    public
    void cambioPresionNeumaticos (Integer nuevoNivel) {
        this.autoMemory.cambioPresionNeumaticos(nuevoNivel);
    }

    public
    void cambioNivelAgua (Integer nuevoNivel) {
        this.autoMemory.cambioNivelAgua(nuevoNivel);
    }

    public
    void cambioEstadoChapas (String nuevoEstado) {
        this.autoMemory.cambioEstadoChapas(nuevoEstado);
    }


}
