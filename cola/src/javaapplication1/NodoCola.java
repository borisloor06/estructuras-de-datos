/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Boris Loor
 */
import java.util.*;
public class NodoCola {
     static Queue crearCola(){
        Queue<String> cola = new LinkedList<>();
        System.out.println("Programador... has creado una cola");
        return cola;
    }
     
     static void imprimirCola(Queue cola){
        if(cola==null)
             System.out.println("Hey... inicializa la cola primero");
        else
            System.out.println("Elementos: "+cola.toString());
     }
     
     static Queue Encolar(Queue cola){
         if(cola==null)
                System.out.println("Hey... inicializa la cola primero");
         else{
                Scanner teclado=new Scanner(System.in);
                System.out.println("Ingresa Valor a encolar");
                String valor=teclado.nextLine();
                cola.add(valor);
                System.out.println("Ingreso exitoso..");
                
         }
         return cola;
         
     }
     
         
     static Queue Desencolar(Queue cola){
         if(cola==null)
                System.out.println("Hey... inicializa la cola primero");
         else{
                System.out.println("Extraccion de la cola: "+cola.remove());
                System.out.println("Sacaste un elemento.");
                
                if(cola.isEmpty()) 
                    cola=null;
                
         }
         return cola;
         
     }
     static void Contar(Queue cola) {
        Queue aux = cola;
        int c;
        int i=0;
        String arr[] = new String[aux.size()];
        String dato;

        do {
           dato = aux.remove().toString();
           c = 1;
           while (aux.contains(dato)) {
              c++;
              aux.remove(dato);
           }
           arr[i]= (dato + ":\t" + c);
           i+=1;  
        } while (aux.size()!=0);
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]!=null){
                    System.out.println(arr[j]);
                }  
            }
        }
    }
    