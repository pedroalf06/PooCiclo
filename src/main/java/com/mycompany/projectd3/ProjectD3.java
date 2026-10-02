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
        int hora, sexo, seguir;
        double cuota;
        
        do{
            Empleado mp = new Empleado();
            
            System.out.println("\nIngrese nombre: ");
            nombre = sc.nextLine();
            
            do {
                System.out.println("Ingresar el sexo: ");
                System.out.println("1-  mujer; 2 -  hombre ");
                sexo = sc.nextInt();

                if (sexo != 1 && sexo != 2) {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            } while (sexo != 1 && sexo != 2);
            
            System.out.println("Ingresar Horas trabajadas: ");
            hora = sc.nextInt();
            
            System.out.println("Ingrese cuota por hora trabajada: ");
            cuota = sc.nextDouble();
            
            mp.setNombre(nombre);
            mp.setHorasT(hora);
            mp.setCuotaH(cuota);
            mp.setSexo(sexo);
            mp.calcularSueldo();
            
            System.out.println("Nombre: "+mp.getNombre());
            System.out.println("Sueldo: "+mp.getSueldo());
            
            System.out.println("Si desea continuar presione 1, de lo contrario presiones otra tecla");
            seguir = sc.nextInt();
            sc.nextLine();
        } while (seguir == 1);
        
    }
}
