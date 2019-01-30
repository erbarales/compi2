/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ant.com.gt;

import generadocup.parser;
import generadojflex.Yylex;
import java.io.FileReader;
import java.io.Reader;
import java_cup.runtime.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author eddyb
 */
public class Principal {
    
    private final static Logger logger = LoggerFactory.getLogger(Principal.class);

    public String parsearArchivo(String archivo) {
        try (Reader reader = new FileReader(archivo)){
            Scanner s = new Yylex(reader);
            parser analizador = new parser(s);  
            analizador.parse();  
            return "OK";
        } catch (Exception e) {
            logger.error("Error parseando archivo", e);
            return "ERROR";
        }        
    }

}
