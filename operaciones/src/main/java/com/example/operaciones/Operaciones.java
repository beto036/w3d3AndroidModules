package com.example.operaciones;

import com.example.operdores.Operadores;
import com.example.validaciones.Validaciones;

/**
 * Created by admin on 11/2/2016.
 */

public class Operaciones {

    Validaciones validaciones;

    public Operaciones() {
        validaciones = new Validaciones();
    }

    public int sum(Operadores operadores){
        return operadores.getA()+operadores.getB();
    }

    public int sub(Operadores operadores) throws Exception {
        if (!validaciones.validateGT(operadores.getA(), operadores.getB()))
            throw new Exception("The second operator cannot be greater than the first");
        return operadores.getA()-operadores.getB();
    }

    public int div(Operadores operadores) throws Exception {
        if(validaciones.validateZero(operadores.getB()))
            throw new Exception("The second operator cannot be 0");
        return operadores.getA()/operadores.getB();
    }
}
