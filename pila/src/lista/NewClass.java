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
public class NewClass {
    public static LinkedList crearLista(){
        return new LinkedList<String>();
    }
    
    
    public static void imprimirLista(LinkedList lista) {
        System.out.println("Lista:"+lista.toString());
    }
    
    public static LinkedList insercionCabecera(LinkedList lista)
       {
           if(lista==null){
               System.out.println("Debe crear la lista primero");
           }
           String nuevoValor;
           Scanner teclado=new Scanner(System.in);
           System.out.println("Ingrese valor");
           nuevoValor=teclado.nextLine();
           if(lista.contains(nuevoValor)){
               System.out.println("Valor repetido");
           }
           else{
           lista.addFirst(nuevoValor);
           }
           
           return lista;
       }

    static void estaVacia(LinkedList lista) {
        if(lista.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("Existen datos en la lista");
        }
    }
}
