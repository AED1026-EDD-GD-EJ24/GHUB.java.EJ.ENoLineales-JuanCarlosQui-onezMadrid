package miPrincipal;

import java.util.Scanner;
import arbolBinarioOrdenado.ArbolBinario;
import arbolBinarioOrdenado.Entero;
import arbolBinarioOrdenado.BTreePrinter;
import arbolBinarioOrdenado.Persona;

public class AppArbolBinarioBusqueda{
    public static void menu(){
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println();
            System.out.println("********************************");
            System.out.println("       ARBOLES BINARIOS         ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.println("Selecciona opción:");
            
            opc=consola.nextInt();
            switch(opc){
                case 1:
                    insertarNodo();
                    break;

                case 2:
                   eliminarNodos();
                   break;
                case 3:
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                   System.out.println("Opcion inválida");

            }
        } while (opc != 0);
    }
    public static void insertarNodo(){
        System.out.println("**** INSERTAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try{
           
            
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(40));
            
            

        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage()+" "+e.getStackTrace()+e.getLocalizedMessage());
        }
        System.out.println("RECORRIDO DE ARBOLES:");
        System.out.println("\n Recorrido Inorden");
        arbol.inorden();
        System.out.println("\n Recorrido Preorden");
        arbol.preorden();
        System.out.println("\n Recorrido Postorden");
        arbol.postorden();
        //Imprime el arbol depues de la inserción
        System.out.println("\n IMPRESION DEL ARBOL:");
        BTreePrinter.printNode(arbol.getRaiz());

    }
    public static void eliminarNodos(){
        System.out.println("**** ELIMINAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try{
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(40));
            System.out.println("Elimina un Nodo que solamente tiene un hijo");
            System.out.println("Eliminar 2");
            
            
            

        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage()+" "+e.getStackTrace()+e.getLocalizedMessage());
        }
        System.out.println("RECORRIDO DE ARBOLES:");
        System.out.println("\n Recorrido Inorden");
        arbol.inorden();
        System.out.println("\n Recorrido Preorden");
        arbol.preorden();
        System.out.println("\n Recorrido Postorden");
        arbol.postorden();
        //Imprime el arbol depues de la inserción
        System.out.println("\n IMPRESION DEL ARBOL:");
        BTreePrinter.printNode(arbol.getRaiz());


    }

    public Nodo buscar(Object valor){
        Comparable dato = (Comparable) valor;
        if(raiz == null){
            return null;
        }else{
            //aux; auxiliar que va a recorriendo los nodos, desde la raiz
            Nodo aux = raiz;
            while(aux != null){
                if(dato.esIgual(aux.valor)){
                    return aux;
                if dato.esMenor(aux.valor){
                    aux = aux.getIzquierdo();
                }else{
                    aux = aux.getDerecho();
                }
                return null;
        }


    }

    
}