/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ant.com.gt;

import java.util.Objects;

/**
 *
 * @author eddyb
 */
public class Variable {
    
    public Tipo tipo;
    public String nombre;
    public Number valor;

    public Variable(Tipo tipo, String nombre, Number valor) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.valor = valor;
    }        

    @Override
    public String toString() {
        return valor.toString();
    }        

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Variable other = (Variable) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
