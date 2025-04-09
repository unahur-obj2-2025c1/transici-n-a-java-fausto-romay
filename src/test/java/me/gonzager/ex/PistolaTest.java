package me.gonzager.ex;
import me.gonzager.ex.Persona.*;
import me.gonzager.ex.Arma.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PistolaTest {
    private Pistola pistola = new Pistola(10);
    private Soldado jorge = new Soldado(60,List.of(pistola));

    @Test
    public void creacionPistolete(){
        assertEquals(Pistola.class, pistola.getClass());
    }

    @Test
    public void potenciaPistolete(){
        assertEquals(30, pistola.potencia(jorge));
    }
}
