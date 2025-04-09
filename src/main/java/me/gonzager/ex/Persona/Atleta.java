package me.gonzager.ex.Persona;
import me.gonzager.ex.Planeta.*;

public class Atleta extends Persona {
    private Integer masaMuscular = 4;
    private Integer tecnicasConocidas = 2;

    public Atleta(Integer edad) {
        super(edad);
    }

    @Override
    public Integer potencia() {
        return super.potencia() + (masaMuscular * tecnicasConocidas);
    }

    @Override
    public Boolean esDestacado() {
        return super.esDestacado() || tecnicasConocidas > 5;
    }

    @Override
    public void ofrecerTributo(Planeta planeta) {
        planeta.construirMuralla(2);
    }

    public void entrenar(Integer cantidadDias) {
        masaMuscular += 1 * (cantidadDias / 5);
    }

    public void aprenderTecnica() {
        tecnicasConocidas += 1;
    }
}
