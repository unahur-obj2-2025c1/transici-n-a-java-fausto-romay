package me.gonzager.ex.Planeta;

import java.util.List;
import me.gonzager.ex.Persona.Persona;

public class Planeta {
    private List<Persona> habitantes;
    private Integer cantMuseos;
    private Integer longitudMuralla;

    public Planeta(List<Persona> habitantes, Integer cantMuseos, Integer longitudMuralla) {
        this.habitantes = habitantes;
        this.cantMuseos = cantMuseos;
        this.longitudMuralla = longitudMuralla;
    }

    public List<Persona> getHabitantes() {
        return habitantes;
    }

    public Integer getCantMuseos() {
        return cantMuseos;
    }

    public Integer getLongitudMuralla() {
        return longitudMuralla;
    }

    public List<Persona> delegacionDiplomatica() {
        return this.getHabitantes().stream().filter(habitante -> habitante.esDestacado()).toList();
    }

    public Integer defensaInicial() {
        return this.getHabitantes().stream().filter(habitante -> habitante.potencia() >= 30).toList().size();
    }

    public Boolean esCulto() {
        return cantMuseos >= 2 && this.getHabitantes().stream().allMatch(habitante -> habitante.inteligencia() >= 10);
    }

    public Integer potenciaReal() {
        return this.getHabitantes().stream().mapToInt(habitante -> habitante.potencia()).sum();
    }

    public void construirMuralla(Integer kmSumados) {
        longitudMuralla += kmSumados;
    }

    public void fundarMuseo() {
        cantMuseos += 1;
    }

    public Persona habitanteMasPotente() {
        return this.getHabitantes().stream().max((h1, h2) -> h1.potencia() - h2.potencia()).get();
    }

    public Integer cantidadHabitantes() {
        return habitantes.size();
    }

    public Integer potenciaAparente() {
        return this.habitanteMasPotente().potencia() * this.cantidadHabitantes();
    }

    public Boolean necesitaRefuerzos() {
        return this.potenciaAparente() >= (this.potenciaReal() * 2);
    }

    public void recibirTributos() {
        for (Persona h : habitantes) {
            h.ofrecerTributo(this);
        }
    }

    public List<Persona> habitantesValiosos() {
        return this.getHabitantes().stream().filter(habitante -> habitante.valor() >= 40).toList();
    }

    public void apaciguarOtroPlaneta(Planeta otroPlaneta){
        habitantesValiosos().forEach(h -> h.ofrecerTributo(otroPlaneta));
    }
}
