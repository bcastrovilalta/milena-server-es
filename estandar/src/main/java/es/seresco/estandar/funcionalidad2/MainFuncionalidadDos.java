package es.seresco.estandar.funcionalidad2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainFuncionalidadDos {
	
	public MainFuncionalidadDos() {
		super();
	}
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainFuncionalidadDos.class);
	
    public static void main( String[] args )
    {
    	String cadena;
    	
    	LOGGER.info("Hello estandar funcionalidad dos" );
    	
    	final FunDosMensajeUnoInterface mensaje = new FunDosMensajeUno();
    	
    	cadena = mensaje.imprimirMensajeUno();
    	
    	LOGGER.info(cadena);    	
    }
}
