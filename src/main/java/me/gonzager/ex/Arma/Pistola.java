package me.gonzager.ex.Arma;
import me.gonzager.ex.Persona.*;

public class Pistola extends Arma {
    private Integer largo;

    public Pistola(Integer largo) {
        this.largo = largo;
    }

    @Override
    public Integer potencia(Soldado soldado) {
        return soldado.getEdad() > 30 ? 3 * largo : 2 * largo;
    }
}
