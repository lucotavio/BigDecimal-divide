package com.mycompany.bigdecimaldivide;

import java.math.BigDecimal;
import java.math.MathContext;


public class Main {

    public static void main(String[] args) {
        
        BigDecimal numberOne = new BigDecimal("2.4");
        
        BigDecimal numberTwo = new BigDecimal("1.3");
        
        BigDecimal result = numberOne.divide(numberTwo, MathContext.DECIMAL128);
        System.out.println(result);
    }
}
