package test.ant.com.gt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ant.com.gt.AnalizadorSvc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author eddyb
 */
public class ParserUnitTest {
    
    private AnalizadorSvc principal; 
    
    @Before
    public void setup() {
        principal = new AnalizadorSvc();
    }
    
    @Test
    public void facil() {
        System.out.println("Paso facil");
        String parsearArchivo = principal.parsearArchivo("archivos_prueba/facil.txt");
        Assert.assertEquals("OK", parsearArchivo);
    
    }
    
    @Test
    public void testParser() {
        System.out.println("Entrada auxiliar");
        String parsearArchivo = principal.parsearArchivo("archivos_prueba/archivo_prueba.txt");                
        Assert.assertEquals("OK", parsearArchivo);
    }        
}
