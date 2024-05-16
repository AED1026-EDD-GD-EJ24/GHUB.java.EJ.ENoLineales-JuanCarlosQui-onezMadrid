package miPrincipal;

import java.util.Scanner;
import arbolAVL.ArbolAVL;
import arbolAVL.Entero;
import arbolBinarioOrdenado.BTreePrinter;
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
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                   System.out.println("Opcion inválida");
            }

        }while(opc != 0);
    }
    public static void insertarNodo(){
        System.out.println("**** INSERTAR NODOS ****");
        ArbolAVL abo = new ArbolAVL();
        try{
            //Insertar elementos
            abo.insertar(new Entero(2));
            abo.insertar(new Entero(4));
            abo.insertar(new Entero(6));
            abo.getRaiz();
        

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }

    public static void buscarNodo(){
        System.out.println("**** BUSCAR NODOS ****");
       
        
    }

    public static void eliminarNodos(){
        System.out.println("**** ELIMINAR NODOS ****");
        
        
    }




}
