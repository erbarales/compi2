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
public class CodigoPersonalizado {

    public CodigoPersonalizado(String nombre, int cantidad) {
        this.atributoTexto = nombre;
        this.atributoEntero = cantidad;
    }
    
    private String atributoTexto;
    private int atributoEntero;

    public String getAtributoTexto() {
        return atributoTexto;
    }

    public void setAtributoTexto(String atributoTexto) {
        this.atributoTexto = atributoTexto;
    }

    public int getAtributoEntero() {
        return atributoEntero;
    }

    public void setAtributoEntero(int atributoEntero) {
        this.atributoEntero = atributoEntero;
    }

    @Override
    public String toString() {
        return "CodigoPersonalizado{" + "atributoTexto=" + atributoTexto + ", atributoEntero=" + atributoEntero + '}';
    }

   
    
    
}
