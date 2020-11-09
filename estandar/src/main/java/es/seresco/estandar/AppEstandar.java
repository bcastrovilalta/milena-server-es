package es.seresco.estandar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.seresco.estandar.funcionalidad1.*;
import es.seresco.estandar.funcionalidad2.*;

public class AppEstandar {

    public AppEstandar() {
        super();
    }
    
	private static final Logger LOGGER = LoggerFactory.getLogger(AppEstandar.class);
	
    public static void main( String[] args )
    {
    	String cadena;
    	
    	LOGGER.info("Hello estandar");
    	
    	LOGGER.info("Hello estandar funcionalidad uno" );
    	
    	final FunUnoMensajeUnoInterface mensajeUno = new FunUnoMensajeUno();
    	
    	cadena = mensajeUno.imprimirMensajeUno();
    	
    	LOGGER.info(cadena);
    	
    	final FunUnoMensajeDosInterface mensajeDos = new FunUnoMensajeDos();
    	
    	cadena = mensajeDos.imprimirMensajeDos();
    	
    	LOGGER.info(cadena);
    	
    	LOGGER.info("Hello estandar funcionalidad dos" );
    	
    	final FunDosMensajeUnoInterface mensaje = new FunDosMensajeUno();
    	
    	cadena = mensaje.imprimirMensajeUno();
    	
    	LOGGER.info(cadena);  
    	
    }	
}
