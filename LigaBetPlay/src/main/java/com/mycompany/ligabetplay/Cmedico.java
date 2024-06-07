/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

/**
 *
*/
public class Cmedico extends Team{
String Titulcaion;
String Cargo;
int AniosExperiencia;
    
    public Cmedico(int Id, String NombreE,String Cargo, String Nombre, String Apellidos, int Edad,String Titulcaion, int AniosExperiencia) {
        super(Id, NombreE,Nombre, Apellidos, Edad);
        this.Cargo = Cargo;
        this.Titulcaion= Titulcaion;
        this.AniosExperiencia = AniosExperiencia;
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
