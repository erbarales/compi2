/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author eddyb
 */
public class ParserUnitTest {
    
    Principal p = new Principal();
    
    @Test
    public void testParser() throws Exception {
        String parsearArchivo = p.parsearArchivo("archivos_prueba/archivo_prueba.txt");
        Assert.assertEquals("OK", parsearArchivo);
    }        
}
