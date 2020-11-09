package es.seresco.estandar.funcionalidad1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainFuncionalidadUno 
{
    public MainFuncionalidadUno() {
        super();
    }
    
	private static final Logger LOGGER = LoggerFactory.getLogger(MainFuncionalidadUno.class);
	
    public static void main( String[] args )
    {
    	String cadena;
    	
    	LOGGER.info("Hello estandar funcionalidad uno" );
    	
    	final FunUnoMensajeUnoInterface mensajeUno = new FunUnoMensajeUno();
    	
    	cadena = mensajeUno.imprimirMensajeUno();
    	
    	LOGGER.info(cadena);
    	
    	final FunUnoMensajeDosInterface mensajeDos = new FunUnoMensajeDos();
    	
    	cadena = mensajeDos.imprimirMensajeDos();
    	
    	LOGGER.info(cadena);
    	
    }
}
