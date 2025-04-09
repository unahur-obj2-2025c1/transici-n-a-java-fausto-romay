package me.gonzager.ex.Persona;
import me.gonzager.ex.Arma.*;

import java.util.List;

import me.gonzager.ex.Planeta.Planeta;

public class Soldado extends Persona {
    private List<Arma> armas;

    public Soldado(Integer edad, List<Arma> armas) {
        super(edad);
        this.armas = armas;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    @Override
    public Integer potencia() {
        return super.potencia() + this.getArmas().stream().mapToInt(arma -> arma.potencia(this)).sum();
    }

    @Override
    public void ofrecerTributo(Planeta planeta){
        planeta.construirMuralla(5);
    }
}
