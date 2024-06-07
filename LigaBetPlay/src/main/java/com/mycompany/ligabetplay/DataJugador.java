/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camper
 */
public class DataJugador {
    // Lista de equipos
    static List<Team> listaTeam = new ArrayList<>();

    // Constructor para inicializar la lista de equipos (puedes omitir el constructor si prefieres inicializar la lista de equipos en un método estático)
    public DataJugador (Team team) {
        listaTeam.add(team);
    }
     public static String obtenerNombreJugador(String nombreDeseado) {
        for (Team team : listaTeam) {
            if (team.getNombre().equals(nombreDeseado)) {
                return team.getNombre()+ "ENCONTRADO";
            }
        }
        return null; // Retorna null si el equipo no fue encontrado
    }
    
}