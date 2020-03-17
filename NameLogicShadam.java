/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfromjava.Function;

import latihanfromjava.Model.ModelProgram;

/**
 *
 * @author Shadam Ramadhan
 */
public class NameLogic {

    public String returnName(ModelProgram modelProgram){
        return "Hello, you must be" + modelProgram.getName();
    }
    public String returnNull(ModelProgram modelProgram){
        return "Your Name Couldn't be empty" + modelProgram.getName();
    }
}
