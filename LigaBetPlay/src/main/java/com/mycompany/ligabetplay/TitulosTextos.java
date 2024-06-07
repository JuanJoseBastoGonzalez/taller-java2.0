/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ligabetplay;

import java.util.EnumSet;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.w3c.dom.ranges.RangeException;

/**
 *
 * @author camper
 */
public abstract class TitulosTextos {

    public TitulosTextos() {
    }

    public static int menuInicio() {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean isActive = true;
        while (isActive) {
            System.out.println("1) Menu de registros");
            System.out.println("2) Menu de informes");
            System.out.println("3) Retroceder");
            try {
                op = Integer.parseInt(sc.nextLine());
                isActive = false; // Si llega a este punto sin lanzar una excepción, se detiene el bucle
            } catch (NumberFormatException e) {
                System.out.println("Solo se permiten valores numéricos.");
                System.out.println("Ingrese un valor nuevamente.");
            }
        }
        return op;

    }

    public static int mRegistros() {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean isActive = true;
        while (isActive) {
            System.out.println("1) Registrar Equipo");
            System.out.println("2) Registrar Persona");
            System.out.println("3) Registrar Partido");
            System.out.println("4) Retroceder");
            try {
                op = Integer.parseInt(sc.nextLine());
                isActive = false; // Si llega a este punto sin lanzar una excepción, se detiene el bucle
            } catch (NumberFormatException e) {
                System.out.println("Solo se permiten valores numéricos.");
                System.out.println("Ingrese un valor nuevamente.");
            }
        }

        return op;
    }
    public  static String mRegistrosPe(){
        System.out.println("1) Jugador");
        System.out.println("2) Ctecnico");
        System.out.println("3) Cmedico");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        return op;
    }

    public static String mRegitroEq() {

        System.out.println("Ingrese el nombre del equipo quedesa registrar");
        Scanner sc = new Scanner(System.in);
        String NombreE = sc.nextLine();
        return NombreE;
    }

    public static String mRegistroJuN() {
        System.out.println("Ingrese el nombre del jugador ");
        Scanner sc = new Scanner(System.in);
        String NombreJuN = sc.nextLine();
        return NombreJuN;
    }

    public static String mRegistroJuA() {
        System.out.println("Ingrese el apellido del jugador ");
        Scanner sc = new Scanner(System.in);
        String NombreJuA = sc.nextLine();
        return NombreJuA;
    }

    public static int mRegistroJuE() {
        System.out.println("Ingrese la edad del jugador ");
        Scanner sc = new Scanner(System.in);
        int EdadJu = Integer.parseInt(sc.nextLine());
        return EdadJu;
    }

    public static String mValidarEq() {
        System.out.println("Ingrese el equipo del jugador (para validar) ");
        Scanner sc = new Scanner(System.in);
        String EdadJu = sc.nextLine();
        return EdadJu;
    }
      public static String mRegistroDor() {
        System.out.println("Ingrese la demarcacion del jugador ");
        Scanner sc = new Scanner(System.in);
        String Dor = sc.nextLine();
        return Dor;
    }
    public static String mRegistroDem() {
        System.out.println("Ingrese la demarcacion del jugador ");
        Scanner sc = new Scanner(System.in);
        String Dem = sc.nextLine();
        return Dem;
    }
       public static void mInformes() {
           System.out.println("1) Jugador con mas goles anotados");   
           System.out.println("1) Tabla de posiciones");   
           System.out.println("1) Listar cuerpo tecnico");   
           System.out.println("1) Listar Jugadores por equipo");      
    }
    public  static String ScStr(){
     Scanner sc = new Scanner(System.in);
        String scS = sc.nextLine();
        return scS;
    }
    
    public  static  int ScInt(){
    Scanner sc = new Scanner(System.in);
        int scIn = Integer.parseInt(sc.nextLine());
        return scIn;
    
    }
    

    
    
    
    
    
    
}
