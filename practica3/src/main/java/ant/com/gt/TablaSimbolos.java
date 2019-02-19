/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ant.com.gt;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author eddyb
 */
public class TablaSimbolos {
    
    private final static Logger logger = 
            LoggerFactory.getLogger(TablaSimbolos.class);
    
    Map<String, Variable> mapa;

    public TablaSimbolos() {
        this.mapa = new HashMap();
    }
    
    public void agregar(Variable variable) {        
        logger.debug("Agregando " + variable);
        mapa.put(variable.nombre, variable);
    }
    
    public Variable buscar(String nombre) {
        logger.debug("Buscando " + nombre);
        return mapa.get("nombre");
    }
    
    public void imprimir(Variable variable) {
        if (variable == null) {
            logger.debug("Variable nula");
            return;
        }
        logger.info(variable.valor.toString());
    }
        
}
