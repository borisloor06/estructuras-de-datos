/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Boris Loor
 */
public class main {
   public static void main(String[] args) {
        
     LinkedList <String> miLista=null;
        
        int opcion;
        Scanner teclado=new Scanner(System.in);
        
        do{
            System.out.println("Menú de opciones..\n"+
                            "1.- Crear lista\n"
                            +"2.- Inserción en cabecera\n"
                            +"3.- ¿Esta vacía?\n"
                            +"4.- Imprimir\n"
                            +"5.- Salir\n");
                            
            opcion=teclado.nextInt();
            
            switch(opcion){
                case 1: 
                        miLista = NewClass.crearLista();
                        System.out.println("Se ha creado la lista");
                         break ;
                case 2: 
                        miLista=NewClass.insercionCabecera(miLista);
                       System.out.println("Se ha insertado en la cabecera");
                        break;
                case 3: 
                       NewClass.estaVacia(miLista);
                       System.out.println("Operación realizada");
                        break;
                case 4:        
                        System.out.println("Imprimiendo la cola...");
                        NewClass.imprimirLista(miLista);
                        break;
                case 5: 
                        break;
            }
             } while(opcion!=5);
   }
}
