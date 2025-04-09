package me.gonzager.ex;
import me.gonzager.ex.Arma.*;
import me.gonzager.ex.Persona.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class EspadaTest {
    private Espada espada = new Espada(5);
    private Soldado jorge = new Soldado(60,List.of(espada));

    @Test
    public void creacionEspadon(){
        assertEquals(Espada.class, espada.getClass());
    }

    @Test
    public void potenciaEspadon(){
        assertEquals(6, espada.potencia(jorge));
    }
}
