/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.serie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Serie2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        Alumno datos = new Alumno();
        List<Alumno> lista = new ArrayList();
        
        do{
            System.out.print("Digite una opción: "
                    + "\n1. Guardar estudiante"
                    + "\n2. Mostrar listado de estudiante"
                    + "\n3. Salir"
                    + "\n\nOpcion: ");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1: System.out.print("Código de Estudiante: ");
                        datos.setCodEstudiante(entrada.next());
                        
                        System.out.print("\n\nPrimer nombre: ");
                        datos.setPrimerNombre(entrada.next());
                        
                        System.out.print("\n\nSegundo nombre: ");
                        datos.setSegundoNombre(entrada.next());
                        
                        System.out.print("\n\nPrimer Apellido: ");
                        datos.setPrimerApellido(entrada.next());
                        
                        System.out.print("\n\nSegundo Apellido: ");
                        datos.setSegundoApellido(entrada.next());
                        
                        System.out.print("\n\nFacultad: ");
                        datos.setFacultad(entrada.next());
                        
                        System.out.print("\n\nPromedio: ");
                        datos.setProm(Float.parseFloat(entrada.next()));
                        
                        lista.add(new Alumno(datos.getCodEstudiante(), datos.getPrimerNombre(), datos.getSegundoNombre(), datos.getPrimerApellido(), datos.getSegundoApellido(), datos.getFacultad(), datos.getProm()));

                        System.out.println("Datos Guardados!!!");
                    break;
                    
                case 2: lista.forEach(System.out::println);
                    break;
                    
                case 3: System.out.println("Saliendo...");
                    break;
            
            }
            
            
        }while(opc != 3);
    }
}
