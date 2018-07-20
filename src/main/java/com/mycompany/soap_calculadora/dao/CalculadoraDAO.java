/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.soap_calculadora.dao;

/**
 *
 * @author Diego Torres
 */
public class CalculadoraDAO {
    public double suma (double num1, double num2){
        double res;
        res = num1+num2;
        return res;
    }
    
    public double diferencia (double num1, double num2){
        double res=0.0f;
        res = num1-num2;
        return res;
    }
    
    public double multiplicacion (double num1, double num2){
        double res=0.0f;
        res=num1*num2;
        return res;
    }
    
    public double division (double num1, double num2){
        double res=0.0f;
        res=num1/num2;
        return res;
    }
}
