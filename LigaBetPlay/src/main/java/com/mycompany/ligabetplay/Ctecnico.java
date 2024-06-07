/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

/**
 *
 * @author camper
 */

public class Ctecnico extends Team{
 String IdFederacion;
    String Cargo;
   
    public Ctecnico(int Id, String NombreE, String Cargo, String Nombre, String Apellidos, int Edad, String IdFederacion) {
        super(Id, NombreE,Nombre, Apellidos, Edad);
        this.Cargo = Cargo;
        this.IdFederacion = IdFederacion;
    }

    @Override
    public void concentrearce() {
        System.out.println("Jugador concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("El jugador puede viajar");
    }
    
    

  
}