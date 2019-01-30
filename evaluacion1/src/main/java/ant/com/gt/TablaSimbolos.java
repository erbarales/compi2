/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ant.com.gt;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author eddyb
 */
public class TablaSimbolos {
    
    private final static Logger logger = 
            LoggerFactory.getLogger(TablaSimbolos.class);
    
    List<Simbolo> simbolos;        
    
    public TablaSimbolos() {
        simbolos = new ArrayList<>();
    }        
    
    public void agregar(Simbolo simbolo) {
        simbolos.add(simbolo);
    }
    
    public void imprimirEntorno(int entorno) {
        if (entorno < 0) return;
        logger.info("Mostrando " + entorno);
        for (Simbolo simbolo : simbolos) {
            if (simbolo.ambito == entorno) logger.info("-> " + simbolo);
        }
        logger.info("fin " + entorno);
    }
}
