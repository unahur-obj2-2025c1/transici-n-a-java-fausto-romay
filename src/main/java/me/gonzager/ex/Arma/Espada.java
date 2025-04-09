package me.gonzager.ex.Arma;
import me.gonzager.ex.Persona.*;

public class Espada extends Arma {
    private Integer peso;

    public Espada(Integer peso) {
        this.peso = peso;
    }

    @Override
    public Integer potencia(Soldado soldado) {
        return soldado.getEdad() < 40 ? peso / 2 : 6;
    }
}
