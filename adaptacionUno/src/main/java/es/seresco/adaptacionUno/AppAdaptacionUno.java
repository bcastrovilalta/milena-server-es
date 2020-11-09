package es.seresco.adaptacionUno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.seresco.adaptacionUno.funcionalidad2.AdapUnoFunDosMensajeUnoInterface;
import es.seresco.adaptacionUno.funcionalidad2.AdapUnoFunDosMensajeUno;
import es.seresco.estandar.funcionalidad1.*;


public class AppAdaptacionUno {

    public AppAdaptacionUno() {
        super();
    }
    
	private static final Logger LOGGER = LoggerFactory.getLogger(AppAdaptacionUno.class);
	
    public static void main( String[] args )
    {
    	String cadena;    	    	
    	
    	LOGGER.info("Hello adaptación uno");
    	
    	// Usamos funcionalidad del estandar.
    	
    	LOGGER.info("Hello estandar funcionalidad uno" );
    	
    	final FunUnoMensajeUnoInterface mensajeUno = new FunUnoMensajeUno();
    	
    	cadena = mensajeUno.imprimirMensajeUno();
    	
    	LOGGER.info(cadena);   
    	
    	// Usamos funcionalidad de la adaptación.
    	
    	LOGGER.info("Hello adaptacion uno funcionalidad dos" );
    	
    	final AdapUnoFunDosMensajeUnoInterface mensajeDos = new AdapUnoFunDosMensajeUno();
    	
    	cadena = mensajeDos.imprimirMensajeUno();
    	
    	LOGGER.info(cadena);  
    }
}
