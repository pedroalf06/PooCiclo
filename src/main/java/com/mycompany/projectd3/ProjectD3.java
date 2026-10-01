/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectd3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ProjectD3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        String nombre;
        int hora;
        double cuota;
        
        Empleado mp = new Empleado();
        
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingresar Horas trabajadas: ");
        hora = sc.nextInt();
        
        System.out.println("Ingrese cuota por hora trabajada: ");
        cuota = sc.nextDouble();
        
        mp.setNombre(nombre);
        mp.setHorasT(hora);
        mp.setCuotaH(cuota);
        mp.calcularSueldo();
        
        System.out.println("Nombre: "+mp.getNombre());
        System.out.println("Sueldo: "+mp.getSueldo());
                               
        
    }
}
