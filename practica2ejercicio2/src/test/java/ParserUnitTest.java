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
