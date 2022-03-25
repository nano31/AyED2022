/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;
import java.util.Scanner;
/**
 *
 * @author zompi
 */
public class Test {
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Estudiante[] vEstudiantes = new Estudiante[2];
        Estudiante e;
        Profesor[] vProfesores = new Profesor[3];
        Profesor p;
        String dato;
        int j;
        for (int i = 0; i < vEstudiantes.length; i++) {
            System.out.println("Carga estudiantes");
            e = new Estudiante();
            System.out.print("Nombre: "); dato = in.nextLine();
            e.setNombre(dato);
            System.out.print("Apellido: "); dato = in.nextLine();
            e.setApellido(dato);
            System.out.print("Comision: "); j = in.nextInt();
            e.setComision(j);
            System.out.print("Direccion: "); dato = in.nextLine();
            e.setDireccion(dato);
            System.out.print("Email: "); dato = in.nextLine();
            e.setEmail(dato);
            vEstudiantes[i] = e;
        }
        for (int k = 0; k < vProfesores.length; k++) {
            System.out.println("Carga profesores");
            p = new Profesor();
            System.out.println("Nombre: "); dato = in.nextLine();
            p.setNombre(dato);
            System.out.println("Apellido: "); dato = in.nextLine();
            p.setApellido(dato);
            System.out.println("Email: "); dato = in.nextLine();
            p.setEmail(dato);
            System.out.println("Catedra: "); dato = in.nextLine();
            p.setCatedra(dato);
            System.out.println("Facultad: "); dato = in.nextLine();
            p.setFacultad(dato);
            vProfesores[k] = p;
        }
        
        System.out.println("Imprimo estudiantes");
        for (int i = 0; i < vEstudiantes.length; i++) {
            System.out.println(vEstudiantes[i].tusDatos());
            System.out.println("---------------------------------------------");
        }
        System.out.println("Imprimo profesores");
        for (int i = 0; i < 10; i++) {
            System.out.println(vProfesores[i].tusDatos());
            System.out.println("---------------------------------------------");
        }
    }
    
}
