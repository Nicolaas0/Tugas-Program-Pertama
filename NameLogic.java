/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.Function;

import belajar.java.Model.ModelProgram;

/**
 *
 * @author nicol
 */
public class NameLogic extends ModelProgram{
    
    public String returnName(ModelProgram modelProgram){
        return  "hello, you must be " + modelProgram.getName();
        
    }
    
    public String returnKosong(ModelProgram modelProgram){
        return  "Please fill the box, it couldnt be empty " + modelProgram.getName();}
}