/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

import java.util.List;

/**
 *
 * @author camper
 */
public class Equipos {

    int Id;
    private String Nombre;
    private int Pj;
    private int Pg;
    private int Pe;
    private int Pp;
    private int Tp;
    private int Gf;
    private int Gc;
    private int Tg;

    public Equipos(int Id, String Nombre) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Pj = 0;
        this.Pg = 0;
        this.Pe = 0;
        this.Pp = 0;
        this.Tp = 0;
        this.Gf = 0;
        this.Gc = 0;
        this.Tg = 0;

    }

    public int getTg() {
        return Tg;
    }

    public void setTg(int Tg) {
        this.Tg = Tg;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPj() {
        return Pj;
    }

    public void setPj(int Pj) {
        this.Pj = Pj;
    }

    public int getPg() {
        return Pg;
    }

    public void setPg(int Pg) {
        this.Pg = Pg;
    }

    public int getPe() {
        return Pe;
    }

    public void setPe(int Pe) {
        this.Pe = Pe;
    }

    public int getPp() {
        return Pp;
    }

    public void setPp(int Pp) {
        this.Pp = Pp;
    }

    public int getTp() {
        return Tp;
    }

    public void setTp(int Tp) {
        this.Tp = Tp;
    }

    public int getGf() {
        return Gf;
    }

    public void setGf(int Gf) {
        this.Gf = Gf;
    }

    public int getGc() {
        return Gc;
    }

    public void setGc(int Gc) {
        this.Gc = Gc;
    }

    /*public String BuscarEq(String idBuscado) {
     if (this.Nombre.equals(idBuscado)) {
            return  " ENCONTRADO" ; // Devuelve el nombre y apellidos si el ID coincide
        } else {
            return "Equipo no encontrado"; // Devuelve null si el ID no coincide
    }*/
    public String BuscarEq(String idBuscado) {

        if (this.Nombre != null && this.Nombre.trim().equalsIgnoreCase(idBuscado.trim())) {
            return "ENCONTRADO"; // Devuelve el nombre y apellidos si el ID coincide
        } else {
            return "Equipo no encontrado"; // Devuelve null si el ID no coincide
        }
    }

    public String getNombre() {
        return Nombre;
    }

}
