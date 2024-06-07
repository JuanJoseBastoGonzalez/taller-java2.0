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

public class DataCmedico {
    // Lista de equipos
    static List<Cmedico> listaCmedico= new ArrayList<>();

    // Constructor para inicializar la lista de equipos (puedes omitir el constructor si prefieres inicializar la lista de equipos en un método estático)
    public DataCmedico (Cmedico cmedico) {
        listaCmedico.add(cmedico);
    }
     public static String obtenertecmico(String nombreDeseado) {
        for (Cmedico cmedico : listaCmedico) {
            if (cmedico.getNombre().equals(nombreDeseado)) {
                return cmedico.getNombre()+ "ENCONTRADO";
            }
        }
        return null; // Retorna null si el equipo no fue encontrado
    }
    
}