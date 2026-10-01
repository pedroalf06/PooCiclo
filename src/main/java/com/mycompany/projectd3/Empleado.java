/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectd3;

/**
 *
 * @author Usuario
 */
public class Empleado {
    
    private String nombre;
    private int horasT, sexo;
    private double cuotaH, sueldo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public void setCuotaH(double cuotaH) {
        this.cuotaH = cuotaH;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    
    
    public void calcularSueldo(){
   do{
        switch(sexo){
        case 1: sueldo = (horasT *cuotaH) *2;
        break;
        
        case 2: sueldo = horasT *cuotaH;
        break;
        
        default: System.out.println("opcion Invalida");
    }
   }while(sexo != 1 || sexo != 2 );  
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    
            
    
}
