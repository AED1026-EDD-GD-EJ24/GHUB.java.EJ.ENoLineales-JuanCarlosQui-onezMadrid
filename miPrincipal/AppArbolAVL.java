package miPrincipal;
import arbolAVL.ArbolAVL;
import arbolAVL.Entero;

import java.util.Scanner;
import arbolAVL.BTreePrinter;

public class AppArbolAVL{
    public static void menu(){
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("********************************");
            System.out.println("       ARBOLES AVL              ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.out.println("4) Mostrar árbol               ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.print("Selecciona opción:");

            opc=consola.nextInt();
                switch(opc){
                    case 1:
                       insertarNodo();
                       break;
                    case 2:
                       buscarNodo();
                       break;
                    case 3:
                       eliminarNodos();
                        break;
                    case 4:
                       System.out.println("Opcion inválida");

                    default:

                }
        } while (opc !=0);
    }
    public static void insertarNodo(){
        System.out.println("**** INSERTAR NODOS ****");
        ArbolAVL abo = new ArbolAVL();
        
        try{
            //insertar algunos elemento
            /* 
            abo.insertar(new Entero(2));
            abo.insertar(new Entero(4));
            abo.insertar(new Entero(6));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            abo.insertar(new Entero(10));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            abo.insertar(new Entero(20));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            
            //vamos a comparar con el árbol solamente ordenado
            /* 
            abo.insertar(new Entero(10));
            abo.insertar(new Entero(15));
            abo.insertar(new Entero(30));
            abo.insertar(new Entero(5));
            abo.insertar(new Entero(2));
            abo.insertar(new Entero(1));
            abo.insertar(new Entero(40));
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            */

           

        }
        catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
        System.out.println("Recorrido inorden");
        abo.inorden();
        System.out.println();

    }
    public static void eliminarNodos() {
        System.out.println("**** ELIMINAR NODOS ****");

        ArbolAVL abo = new ArbolAVL();
        try{
         abo.insertar(new Entero(10));
            abo.insertar(new Entero(15));
            abo.insertar(new Entero(30));
            abo.insertar(new Entero(5));
            abo.insertar(new Entero(2));
            abo.insertar(new Entero(1));
            abo.insertar(new Entero(40));
            System.out.println("RECORRIDO DE ARBOLES:");
            System.out.println("\n Recorrido Inorden");
            abo.inorden();
            System.out.println("\n Recorrido Preorden");
            abo.preorden();
            System.out.println("\n Recorrido Postorden");
            abo.postorden();
            //Imprime el arbol depues de la inserción
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());

            System.out.println("Mostrar el arbol después de la insercion");
            System.out.println("Elimina un Nodo que solamente tiene un hijo");
            System.out.println("Eliminar 1 que es una hoja");
            abo.eliminar(new Entero(1));
            System.out.println("RECORRIDO DE ARBOLES:");
            System.out.println("\n Recorrido Inorden");
            abo.inorden();
            System.out.println("\n Recorrido Preorden");
            abo.preorden();
            System.out.println("\n Recorrido Postorden");
            abo.postorden();
            //Imprime el arbol depues de la inserción
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            System.out.println("Elimino 5 que solamente tiene hijo izquierdo");
            abo.eliminar(new Entero(5));
            System.out.println("RECORRIDO DE ARBOLES:");
            System.out.println("\n Recorrido Inorden");
            abo.inorden();
            System.out.println("\n Recorrido Preorden");
            abo.preorden();
            System.out.println("\n Recorrido Postorden");
            abo.postorden();
            //Imprime el arbol depues de la eliminacion
                        arbolAVL.BTreePrinter.printNode(abo.getRaiz());
                        System.out.println("Elimino 30 que solamente tiene hijo derecho");
                        abo.eliminar(new Entero(30));
                        System.out.println("\n IMPRESION DEL ARBOL:");
                        arbolAVL.BTreePrinter.printNode(abo.getRaiz());
                        System.out.println("Elimina 10 que tiene hijo izquierdo y derecho");
                        abo.eliminar(new Entero(10));
                        System.out.println("\n IMPRESION DEL ARBOL:");
                        arbolAVL.BTreePrinter.printNode(abo.getRaiz());
                        //inserto algunos nodos
                        abo.insertar(new Entero(1));
                        abo.insertar(new Entero(-5));
                        System.out.println("\n IMPRESION DEL ARBOL:");
                        arbolAVL.BTreePrinter.printNode(abo.getRaiz());
                        abo.insertar(new Entero(-3));
            abo.insertar(new Entero(-3));
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            abo.eliminar(new Entero(2));
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            
        }
        catch(Exception e){
            System.out.println("error "+e.getMessage());
        }

    }
    public static void buscarNodo(){
        System.out.println("**** BUSCAR NODOS ****");
    }


}