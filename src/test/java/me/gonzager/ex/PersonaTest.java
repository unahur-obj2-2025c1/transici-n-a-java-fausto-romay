package me.gonzager.ex;
import me.gonzager.ex.Planeta.*;
import me.gonzager.ex.Persona.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class PersonaTest {
    private Persona julieta = new Persona(42);
    
    @Test
    public void creacionPersonaGenerica(){        
        assertEquals(Persona.class, julieta.getClass());
    }

    @Test
    public void creacionPersonaGenericaDe42Anios(){        
        assertEquals(42, julieta.getEdad());
    }

    @Test
    public void potenciaDeJulieta(){
        assertEquals(20, julieta.potencia());
    }

    @Test
    public void inteligenciaDeJulieta(){
        assertEquals(8, julieta.inteligencia());
    }

    @Test
    public void esDestacadaJulieta(){
        assertFalse(julieta.esDestacado());
    }  

    @Test
    public void ofreceTributoJulieta(){
        Planeta p = new Planeta(List.of(julieta), 0, 0);
        julieta.ofrecerTributo(p);
        assertEquals(0, p.getCantMuseos());
        assertEquals(0, p.getLongitudMuralla());
    }

    @Test
    public void valorDeJulieta(){
        var valor = julieta.potencia() + julieta.inteligencia();
        assertEquals(valor, julieta.valor());
    }
}
