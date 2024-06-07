/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

import static com.mycompany.ligabetplay.Data.obtenerNombreEquipo;
import java.util.List;
import javax.sound.midi.SoundbankResource;
import javax.swing.JOptionPane;

/**
 *
 * @author camper
 */
public class Opciones {

    public static void Opciones(String[] args) {
        //Equipos equipos = new Equipos(1, "Equipo1");
        Integer E = 1;
        Integer J = 1;
        Integer Ct = 1;
        Integer Cm = 1;
        boolean isActive = true;
        while (isActive) {
            int opcion = TitulosTextos.menuInicio();
            switch (opcion) {
                case 1:
                    int subOpcion = TitulosTextos.mRegistros();
                    switch (subOpcion) {
                        case 1 -> {
//HCAER QUE LOS ID EN DATA SEAN IGUAL EN LA NUEVA CLASE QUE VA A TENER LOS GOLES.
                            String nombreE = TitulosTextos.mRegitroEq();
                            Equipos equipoNuevo = new Equipos(E, nombreE);
                            Data Data = new Data(equipoNuevo);
                            E += 1;
                            System.out.println(nombreE);
                            System.out.println(equipoNuevo.BuscarEq(nombreE));
                            break;
                        }
                        case 2 -> {
                            int opPersona = Integer.parseInt(TitulosTextos.mRegistrosPe());
                            switch (opPersona) {
                                case 1 -> {
                                    String nombre = TitulosTextos.mValidarEq();
                                    System.out.println(obtenerNombreEquipo(nombre));
                                    //String NombreE = nombre;
                                    // equipos.BuscarEq(nombre); // Llamar al método BuscarEq del objeto Equipos recibido como parámetro
                                    String NombreJuN = TitulosTextos.mRegistroJuN();
                                    String NombreJuA = TitulosTextos.mRegistroJuA();
                                    int EdadJu = TitulosTextos.mRegistroJuE();
                                    int Dorsal = Integer.parseInt(TitulosTextos.mRegistroDor());
                                    String Marcacion = TitulosTextos.mRegistroDem();
                                    Jugadores jugador = new Jugadores(J, nombre, NombreJuN, NombreJuA, EdadJu, Dorsal, Marcacion, 0);
                                    J += 1;
                                    DataJugador dataJugador = new DataJugador(jugador);
                                    System.out.println("jugador Registrado");
                                    break;
                                }
                                case 2 -> {
                                    String nombre = TitulosTextos.mValidarEq();
                                    System.out.println(obtenerNombreEquipo(nombre));
                                    // NombreE = nombre;
                                    System.out.println("Ingrese el nombre del equipo ");
                                    String nombreE = TitulosTextos.ScStr();
                                    System.out.println("Ingrese el cargo de la persona ");
                                    String Cargo = TitulosTextos.ScStr();
                                    System.out.println("Ingrese el nombre de la persona");
                                    String Nombre = TitulosTextos.ScStr();
                                    System.out.println("Ingrese los apellidos de la persona");
                                    String NombreJuA = TitulosTextos.ScStr();
                                    System.out.println("Ingrese la edad de la persona");
                                    int EdadJu = TitulosTextos.ScInt();
                                    System.out.println("Ingrese el id de la federacion");
                                    String IdFederacion = TitulosTextos.ScStr();
                                    Ctecnico ctecnico = new Ctecnico(Ct, nombreE, Cargo, Nombre, NombreJuA, EdadJu, IdFederacion);
                                    DataCtecnico dataCtecnico = new DataCtecnico(ctecnico);
                                    Ct += 1;
                                    break;
                                }
                                case 3 -> {
                                    String nombre = TitulosTextos.mValidarEq();
                                    System.out.println(obtenerNombreEquipo(nombre));
                                    // NombreE = nombre;
                                    System.out.println("Ingrese el nombre del equipo ");
                                    String nombreE = TitulosTextos.ScStr();
                                    System.out.println("Ingrese el cargo de la persona ");
                                    String Cargo = TitulosTextos.ScStr();
                                    System.out.println("Ingrese el nombre de la persona");
                                    String Nombre = TitulosTextos.ScStr();
                                    System.out.println("Ingrese los apellidos de la persona");
                                    String NombreJuA = TitulosTextos.ScStr();
                                    System.out.println("Ingrese la edad de la persona");
                                    int EdadJu = TitulosTextos.ScInt();
                                    System.out.println("Ingrese la titulacion de la persona");
                                    String Titulacion = TitulosTextos.ScStr();
                                    System.out.println("Ingrese los anios de experiencia");
                                    int AniosEX = TitulosTextos.ScInt();
                                    Cmedico cmedico = new Cmedico(Cm, nombreE, Cargo, Nombre, NombreJuA, EdadJu, Titulacion, AniosEX);
                                    Cm += 1;
                                    break;
                                }
                            }
                        }
                        case 3 -> {
                            System.out.println("Ingrese la date");
                            String date = TitulosTextos.ScStr();

                            System.out.println("ingrese el nombre del equipo Local");
                            String EquipoL = TitulosTextos.ScStr();
                            System.out.println("Ingrese la cantidad de goles anotados");
                            int GolesL = TitulosTextos.ScInt();
                            Equipos dataL = obtenerNombreEquipo(EquipoL);
                            System.out.println(dataL.getId() + dataL.getNombre());
                            System.out.println("ingrese el nombre del equipo Visitante");
                            String Equipov = TitulosTextos.ScStr();
                            System.out.println("Ingrese la cantidad de goles anotados");
                            int GolesV = TitulosTextos.ScInt();
                            Equipos dataV = obtenerNombreEquipo(Equipov);
                            if (GolesL == GolesV) {
                                dataV.setPe(dataV.getPe() + 1);
                                dataV.setTp(dataV.getTp() + 1);
                                dataL.setPe(dataV.getPe() + 1);
                                dataL.setTp(dataV.getTp() + 1);
                            } else if (GolesL < GolesV) {
                                dataV.setPg(dataV.getPg() + 1);
                                dataV.setTp(dataV.getTp() + 3);
                            } else {
                                dataL.setPg(dataV.getPg() + 1);
                                dataL.setTp(dataV.getTp() + 3);
                                dataV.setPp(dataV.getPp() + 1);
                            }
                            int golesfL = ControlPG.golesF(GolesV, GolesL);
                            int golesCL = ControlPG.golesF(GolesL, GolesV);
                            dataV.setPj(dataV.getPj() + 1);//partidosjugados auto incrementea
                            dataL.setPj(dataV.getPj() + 1);//partidosjugados auto incrementea
                            dataV.setGf(golesfL);
                            dataV.setGc(golesCL);
                            dataL.setGf(golesCL);
                            dataL.setGc(golesfL);
                            PartidosE partidose = new PartidosE(EquipoL, Equipov, date);

                            //AGREGAR EL DATO FALTANTE 
                            break;
                        }
                    }

                case 2:
                    TitulosTextos.mInformes();
                    TitulosTextos.ScInt();
                    System.out.println("opcion invalida ");

            }
        }
    }
}
