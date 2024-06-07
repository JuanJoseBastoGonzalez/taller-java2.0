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
public class DataPartidos {
    // Lista de equipos
    static List<PartidosE> listaPart= new ArrayList<>();

    // Constructor para inicializar la lista de equipos (puedes omitir el constructor si prefieres inicializar la lista de equipos en un método estático)
    public DataPartidos (PartidosE partidose) {
        listaPart.add(partidose);
    }
     public static String obtenertecmico(String nombreDeseado) {
        for (PartidosE cmedico : listaPart) {
            if (cmedico.getNombre().equals(nombreDeseado)) {
                return cmedico.getNombre()+ "ENCONTRADO";
            }
        }
        return null; // Retorna null si el equipo no fue encontrado
    }
    
}