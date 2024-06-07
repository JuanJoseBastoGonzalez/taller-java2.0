/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

/**
 *
 * @author camper
 */
public abstract class  Team {
    int Id;
    String NombreE;
    String Nombre;
    String Apellidos;
    int Edad;
    
    // Constructor de Team
    public Team(int Id, String NombreE, String Nombre, String Apellidos, int Edad) {
        this.Id = Id;
        this.NombreE = NombreE;
        this.Nombre = Nombre;   
        this.Apellidos = Apellidos;
        this.Edad = Edad;
    }
        // Método abstracto para entrar al equipo
    public abstract void concentrearce();
    public  abstract void viajar();
    
    
     public String obtenerNombrePorId(int idBuscado) {
        if (this.Id == idBuscado) {
            return this.Nombre + " " + this.Apellidos; // Devuelve el nombre y apellidos si el ID coincide
        } else {
            return null; // Devuelve null si el ID no coincide
        }
    }
     public String getNombre() {
        return NombreE;}
     
}