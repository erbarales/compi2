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
public class MathHelper {

    public Variable sumar(Variable v1, Variable v2) {
        if (v1.tipo == Tipo.ERROR) {
            return v1;
        }
        if (v2.tipo == Tipo.ERROR) {
            return v2;
        }
        Number val1 = v1.valor;
        Number val2 = v2.valor;
        Number resultado = val1.doubleValue() + val2.doubleValue();
        return new Variable(Tipo.DOUBLE, "temp", resultado);
    }

    public Variable restar(Variable v1, Variable v2) {
        if (v1.tipo == Tipo.ERROR) {
            return v1;
        }
        if (v2.tipo == Tipo.ERROR) {
            return v2;
        }
        Number val1 = v1.valor;
        Number val2 = v2.valor;
        Number resultado = val1.doubleValue() - val2.doubleValue();
        return new Variable(Tipo.DOUBLE, "temp", resultado);
    }

    public Variable multiplicar(Variable v1, Variable v2) {
        if (v1.tipo == Tipo.ERROR) {
            return v1;
        }
        if (v2.tipo == Tipo.ERROR) {
            return v2;
        }
        Number val1 = v1.valor;
        Number val2 = v2.valor;
        Number resultado = val1.doubleValue() * val2.doubleValue();
        return new Variable(Tipo.DOUBLE, "temp", resultado);
    }

    public Variable dividir(Variable v1, Variable v2) {
        if (v1.tipo == Tipo.ERROR) {
            return v1;
        }
        if (v2.tipo == Tipo.ERROR) {
            return v2;
        }
        double valor = v2.valor.doubleValue();
        if (valor == 0) {
            return new Variable(Tipo.ERROR,
                    "Error division por cero",
                    null);
        }
        Number val1 = v1.valor;
        Number val2 = v2.valor;
        Number resultado = val1.doubleValue() / val2.doubleValue();
        return new Variable(Tipo.DOUBLE, "temp", resultado);
    }

}
