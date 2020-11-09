package es.seresco.estandar.funcionalidad1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionalidadUnoTest {
	
	String cadena;
	FunUnoMensajeUno mensajeUno;
	
    public FuncionalidadUnoTest() {
        super();
    }
    
    @BeforeEach
    void setUp() throws Exception {
    	mensajeUno = new FunUnoMensajeUno();
    }

    @AfterEach
    void tearDown() throws Exception {
    	mensajeUno = null;
    }	
	
    @Test
    void shouldAnswerWithTrue() {
        assertTrue( true );
    }
    
    @Test
    void testimprimirMensajeUno() throws Exception {  
    	cadena = mensajeUno.imprimirMensajeUno();
    	assertEquals("Estandar.Funcionalidad Uno.Mensaje Uno",cadena);
    }
}
