/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import java.util.Scanner;
/**1
 * 
 *
 * @author Boris Loor
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Queue<String> miCola=null;
        
        int opcion;
        Scanner teclado=new Scanner(System.in);
        
        do{
            System.out.println("Menú de opciones..\n"+
                            " 1.- Crear la cola\n"
                            +"2.- Ingresar elemento (encolar)\n"
                            +"3.- Sacar el elemento(Desecolar)\n"
                            +"4.- Imprimir la cola\n"
                            +"5.- Contar Repetidos\n"
                            +"6.- Salir");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1: 
                        miCola=NodoCola.crearCola();
                        System.out.println("Se ha insertado en la cabecera");
                         break ;
                case 2: 
                       miCola=NodoCola.Encolar(miCola);
                       System.out.println("Se ha insertado en la cima");
                        break;
                case 3: 
                       miCola=NodoCola.Desencolar(miCola);
                       System.out.println("Operación realizada");
                        break;
                case 4:        
                        System.out.println("Imprimiendo la cola...");
                        NodoCola.imprimirCola(miCola);
                        break;
                case 5 :
                        System.out.println("Contando Repetidos...");
                        NodoCola.Contar(miCola);
                        break;
                case 6: 
                        break;
            }
        }while(opcion!=6);
        
        System.out.println("Saliste del programa... buen día");
    
    }
    
}
