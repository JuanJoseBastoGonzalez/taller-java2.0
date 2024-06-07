/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

import java.util.ArrayList;
import java.util.List;
import javax.print.DocFlavor;

/**
 *
 * @author camper
 */
public class Data {
    // Lista de equipos
    static List<Equipos> listaEquipos = new ArrayList<>();

    // Constructor para inicializar la lista de equipos (puedes omitir el constructor si prefieres inicializar la lista de equipos en un método estático)
    public Data(Equipos equipo) {
        listaEquipos.add(equipo);
    }
     public static Equipos obtenerNombreEquipo(String nombreDeseado) {
        for (Equipos equipo : listaEquipos) {
            if (equipo.getNombre().equals(nombreDeseado)) {
                return equipo;
            }
        }
        return null; // Retorna null si el equipo no fue encontrado
    }
}
