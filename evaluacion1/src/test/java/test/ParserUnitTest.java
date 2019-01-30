/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ant.com.gt.AnalizadorSvc;
import ant.com.gt.Simbolo;
import ant.com.gt.TablaSimbolos;
import ant.com.gt.Tipo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author eddyb
 */
public class ParserUnitTest {
    
    private static final int AMBITO_0 = 0;    
    
    private AnalizadorSvc principal; 
    private TablaSimbolos tabla;
    
    @Before
    public void setup() {
        principal = new AnalizadorSvc();
        tabla = new TablaSimbolos();
    }
    
    @Test
    public void testTabla() {
        Simbolo simbolo = new Simbolo(AMBITO_0,Tipo.INT,"a");
        tabla.agregar(simbolo);
        tabla.imprimirEntorno(AMBITO_0);
        Assert.assertEquals("OK", "OK");
    }
    
    @Test
    public void facil() {
        String parsearArchivo = principal.parsearArchivo("archivos_prueba/facil.txt");
        System.out.println("Paso facil");
        Assert.assertEquals("OK", parsearArchivo);
    
    }
    
    @Test
    public void testParser() {
        String parsearArchivo = principal.parsearArchivo("archivos_prueba/archivo_prueba.txt");
        System.out.println("Entrada auxiliar");
        
        Assert.assertEquals("OK", parsearArchivo);
    }        
}
