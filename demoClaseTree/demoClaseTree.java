package demoClaseTree;
import java.util.TreeSet;
import java.util.Iterator;
public class demoClaseTree {

    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        //inserto elementos en el arbol
        t.add(5);
        t.add(3);
        t.add(9);
        t.add(2);
        t.remove(9);
        t.remove(9);
        t.add(2);
        //mostrar los elementos del arbol
        System.out.println(t.contains(5));
        System.out.println(t.contains(12));
        System.out.println(t);

        for(Iterator<Integer> it = t.iterator(); it.hasNext();){
            System.out.println(it.next());

        }
    }
    
}
