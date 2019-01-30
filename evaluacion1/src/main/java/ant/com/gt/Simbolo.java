/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ant.com.gt;

/**
 *
 * @author eddyb
 */
public class Simbolo {
    int ambito;
    Tipo tipo;
    String nombre;

    public Simbolo(int ambito, Tipo tipo, String nombre) {
        this.ambito = ambito;
        this.tipo = tipo;
        this.nombre = nombre;
    }        

    @Override
    public String toString() {
        return "Simbolo{" + "ambito=" + ambito + ", tipo=" + tipo + ", nombre=" + nombre + '}';
    }
    
    
}
