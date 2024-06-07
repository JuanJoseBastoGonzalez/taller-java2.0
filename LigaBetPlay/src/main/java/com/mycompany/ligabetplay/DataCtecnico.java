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
public class DataCtecnico {
    // Lista de equipos
    static List<Ctecnico> listaCtecnico = new ArrayList<>();

    // Constructor para inicializar la lista de equipos (puedes omitir el constructor si prefieres inicializar la lista de equipos en un método estático)
    public DataCtecnico (Ctecnico ctecnico) {
        listaCtecnico.add(ctecnico);
    }
     public static Ctecnico obtenertCtecmico(String nombreDeseado) {
        for (Ctecnico ctecnico : listaCtecnico) {
            if (ctecnico.getNombre().equals(nombreDeseado)) {
                return ctecnico;
            }
        }
        return null; // Retorna null si el equipo no fue encontrado
    }
    
}