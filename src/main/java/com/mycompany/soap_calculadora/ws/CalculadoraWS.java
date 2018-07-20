/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.soap_calculadora.ws;

import com.mycompany.soap_calculadora.dao.CalculadoraDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Diego Torres
 */
@WebService(serviceName = "CalculadoraWS")
public class CalculadoraWS {
    
    CalculadoraDAO calculadoraDAO = new CalculadoraDAO();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumar")
    public double sumar(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        return calculadoraDAO.suma(num1, num2);
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicar")
    public double multiplicar(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        return calculadoraDAO.multiplicacion(num1, num2);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "restar")
    public double restar(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        return calculadoraDAO.diferencia(num1, num2);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dividir")
    public double dividir(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        return calculadoraDAO.division(num1, num2);
    }
    

    
}
