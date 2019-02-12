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
public class Lista {
    
    private static final Logger logger = LoggerFactory.getLogger(Lista.class);

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    /**
     * @param cuantos the cuantos to set
     */
    public void setCuantos(int cuantos) {
        this.cuantos = cuantos;
    }

    /**
     * @return the lista
     */
    public List<String> getLista() {
        return lista;
    }
   
    private List<String> lista = new ArrayList<>();
    private int inicio;
    private int cuantos;     
    
    public void mostrarResultado() {
        logger.info(toString());
        
        if (inicio < 1) {
            logger.info("error, posicion de inicio incorrecta");
            return;
        }
        int inicioReal = inicio - 1;
        
        if (inicioReal + cuantos > lista.size() ) {
            logger.info("error, posicion de fin incorrecta");
            return;
        }
        
        String resultado = "";
        for (int i = inicioReal; i< inicioReal+cuantos; i++) {
            if (resultado.isEmpty()) {
                resultado = lista.get(i);
            } else {
                resultado = resultado + "," + lista.get(i);
            }            
        }
        logger.info("Salida: " + resultado);
    }

    @Override
    public String toString() {
        return "lista=" + lista + ", inicio=" + inicio + ", cuantos=" + cuantos;
    }
    
    
    
}
