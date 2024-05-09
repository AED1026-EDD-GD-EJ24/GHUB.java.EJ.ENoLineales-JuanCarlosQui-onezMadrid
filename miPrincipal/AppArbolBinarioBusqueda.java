package miPrincipal;
import java.util.Scanner;
import arbolBinarioOrdenado.ArbolBinarioBusqueda;
import arbolBinarioOrdenado.Entero;
public class AppArbolBinarioBusqueda{

    public static void menu(){
        System.out.println("********************************");
        System.out.println("       ARBOLES BINARIOS         ");
        System.out.println("********************************");
        System.out.println("1) Insertar nodo                ");
        System.out.println("2) Buscar nodo                  ");
        System.out.println("3) Eliminar nodo                ");
        System.err.println();
        System.out.println("0) SALIR                       ");
        System.out.print("Selecciona opción:");
    }





    public static void InsertarNodo(){
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        try{
            arbol.insertarNodo(new Entero(10));
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Recorrido Del arbol");
        arbol.recorrerEnOrden();
        arbol


    }
}