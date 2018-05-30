package util;

import java.io.Serializable;

public class Celular implements Serializable{

    private String numero;

    public Celular() {
    }

    public Celular(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }

}
