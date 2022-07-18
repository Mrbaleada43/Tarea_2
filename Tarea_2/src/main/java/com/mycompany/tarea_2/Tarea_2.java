/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea_2;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Tarea_2 {
//Si desea hacer una suma, el primero numero ingresado debe ser 1
//Si desea hacer una resta, el primero numero ingresado debe ser 2
//Si desea hacer una multiplicacion, el primero numero ingresado debe ser 3
//Si desea hacer una division, el primero numero ingresado debe ser 4
  
    public static void main(String[] args) {
    System.out.println("1.Suma, 2.Resta, 3.Multiplicacion, 4.Division");
    Scanner a = new Scanner(System.in);
    Scanner linea = new Scanner(System.in); 
    System.out.println("Escoja la operacion a realizar");
    int a1=a.nextInt();
    System.out.println("Escriba la Operacion a realizar: ");
    
    String linea1= linea.nextLine();
    if(a1==1){
    String [] numeros = linea1.split("[+]");
       
    int resultado = Integer.parseInt(numeros[0])+Integer.parseInt(numeros[1]); 
    
       
    System.out.println(resultado);    
    }
    if(a1==2){
    String [] numeros = linea1.split("[-]");
       
    int resultado = Integer.parseInt(numeros[0])-Integer.parseInt(numeros[1]); 
    
       
    System.out.println(resultado);    
    }
    if(a1==3){
    String [] numeros = linea1.split("[*]");
       
    int resultado = Integer.parseInt(numeros[0])*Integer.parseInt(numeros[1]); 
    
       
    System.out.println(resultado);    
    }
    if(a1==4){
    String [] numeros = linea1.split("[/]");
       
    int resultado = Integer.parseInt(numeros[0])/Integer.parseInt(numeros[1]); 
    
       
    System.out.println(resultado);    
    }
    
    
    }
}
