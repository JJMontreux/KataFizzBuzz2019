/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author DAM213
 */
public class FizzBuzz {
    
    
    
    public String getFizzBuzz(int i){      
        
        if ((i % 3 == 0) && (i % 5 == 0)) {
            return "FizzBuzz";
        }
        
        if (i % 3 == 0) {
            return "Fizz";
        } 
        
        if (i % 5 == 0) {
            return "Buzz";
        }        
        
        String cadenaI = i + "";
        if ( cadenaI.contains("3")) {
            
            return "Fizz";
        }

        String stringI = i + "";
        if (stringI.contains("5")) {
            return "Buzz";

        }
        
       return i + "";
    }
    
}
