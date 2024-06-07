/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

/**
 *
 * @author camper
 */
public class Jugadores extends Team{
int dorsal;
String demarcacion;
int GolesA;
    
    public Jugadores(int Id, String NombreE, String Nombre, String Apellidos, int Edad,int dorsal, String demarcacion, int GolesA) {
        super(Id, NombreE,Nombre, Apellidos, Edad);
        this.dorsal= dorsal;
        this.demarcacion = demarcacion;
        this.GolesA = 0;
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

