package me.gonzager.ex.Persona;
import me.gonzager.ex.Planeta.*;

public class Docente extends Persona {
    private Integer cantCursosDados = 0;

    public Docente(Integer edad) {
        super(edad);
    }

    @Override
    public Integer inteligencia() {
        return super.inteligencia() + (cantCursosDados * 2);
    }

    @Override
    public Boolean esDestacado() {
        return cantCursosDados > 3;
    }

    @Override
    public void ofrecerTributo(Planeta planeta) {
        planeta.fundarMuseo();
    }

    @Override
    public Integer valor() {
        return this.potencia() + this.inteligencia() + 5;
    } 
}
