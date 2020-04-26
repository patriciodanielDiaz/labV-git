package domain;

import java.util.Objects;

public
class Auto  {

    private String patente;
    private String modelo;
    private String marca;
    private Integer nivelAceite;
    private Integer presionNeumaticos;
    private Integer nivelAgua;
    private String estadoCarroceria;

    public
    Auto (String patente, String modelo, String marca, Integer nivelAceite, Integer presionNeumaticos, Integer nivelAgua, String estadoCarroceria) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.nivelAceite = nivelAceite;
        this.presionNeumaticos = presionNeumaticos;
        this.nivelAgua = nivelAgua;
        this.estadoCarroceria = estadoCarroceria;
    }

    public
    String getPatente ( ) {
        return patente;
    }

    public
    void setPatente (String patente) {
        this.patente = patente;
    }

    public
    String getModelo ( ) {
        return modelo;
    }

    public
    void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public
    String getMarca ( ) {
        return marca;
    }

    public
    void setMarca (String marca) {
        this.marca = marca;
    }

    public
    Integer getNivelAceite ( ) {
        return nivelAceite;
    }

    public
    void setNivelAceite (Integer nivelAceite) {
        this.nivelAceite = nivelAceite;
    }

    public
    Integer getPresionNeumaticos ( ) {
        return presionNeumaticos;
    }

    public
    void setPresionNeumaticos (Integer presionNeumaticos) {
        this.presionNeumaticos = presionNeumaticos;
    }

    public
    Integer getNivelAgua ( ) {
        return nivelAgua;
    }

    public
    void setNivelAgua (Integer nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public
    String getEstadoCarroceria ( ) {
        return estadoCarroceria;
    }

    public
    void setEstadoCarroceria (String estadoCarroceria) {
        this.estadoCarroceria = estadoCarroceria;
    }

    @Override
    public
    boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(patente, auto.patente);
    }

    @Override
    public
    int hashCode ( ) {
        return Objects.hash(patente);
    }

    @Override
    public
    String toString ( ) {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", nivelAceite=" + nivelAceite +
                ", presionNeumaticos=" + presionNeumaticos +
                ", nivelAgua=" + nivelAgua +
                ", estadoCarroceria='" + estadoCarroceria + '\'' +
                '}';
    }
}
