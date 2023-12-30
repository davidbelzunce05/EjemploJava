package org.cuatrovientos.dam.entornosdesarrollo.proyectomaven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Calculadora
{
	private static Logger logger = LogManager.getLogger();
	
	private String operacionEnCurso;
	
    public static void main (String[] args)
    {
    	System.out.println( "Hello World!" );
        logger.error("Hello world with 1DAM: "+args[0]);
        Calculadora miCalculadora = new Calculadora();
        
        switch (args[1]) {
        case "sumar":
        	int resultado = miCalculadora.sumarjdosnumeros(args[2], args[3]);
        	logger.error("Resultado es: "+resultado);
        	break;
        default:
        	break;
        }
    }
    
    /*
	 * Operación que suma dos números
	*/
    /**
     * 
     * @param numero1
     * @param numero2
     * @return
     * TODO me falta validar que número1 y número2 sean números
     */
	public int sumardosnumeros(String numero1, String numero2) {
		int numero1Int = Integer.valueOf(numero1); //FIXME da error cuando numero1 es una letra
		int numero2Int = Integer.valueOf(numero2);
		return  numero1Int + numero2Int;
	
	}
	
	
}
