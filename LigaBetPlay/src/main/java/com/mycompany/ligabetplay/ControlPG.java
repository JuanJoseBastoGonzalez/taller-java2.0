/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

import javax.lang.model.element.NestingKind;

/**
 *
 * @author camper
 */
public class ControlPG {
    public static int golesF(int Local, int Visitante) {
        if (Local == Visitante){
            return  0;
        }else if (Local> Visitante){
        
        int golesfavor = ( Local - Visitante);
        return golesfavor;
        
        }else {
        
        int golesfavor = ( Local -Visitante);
        return golesfavor;
        }  
    }
    

    //public static int 
}
