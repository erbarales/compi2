/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ant.com.gt.Principal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author eddyb
 */
public class ParserUnitTest {
    
    private Principal principal; 
    
    @Before
    public void setup() {
        principal = new Principal();
    }
    
    @Test
    public void testParser() {
        String parsearArchivo = principal.parsearArchivo("archivos_prueba/archivo_prueba.txt");
        Assert.assertEquals("OK", parsearArchivo);
    }        
}
