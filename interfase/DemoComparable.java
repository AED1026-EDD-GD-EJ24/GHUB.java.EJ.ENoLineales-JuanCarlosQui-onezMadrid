package DemoComparable;

public class DemoComparable {
    public static void main(String[] args) {
        // TODO code application logic here

        CriterioPersonaId cpId = new CriterioPersonaId();
        Persona p1 = new Persona(1, "Ana");
        Persona p2 = new Persona(2, "bertha");
        if(cpId.compare(p1, p2) < 0){
            System.out.println("p1 es menor que p2");
        }else(cpId.compare(p1, p2) > 0){
            System.out.println("p1 es mayor que p2");
        }

        CriterioPersonaNombre cpNombre = new CriterioPersonaNombre();
        if(cpNombre.compare(p1, p2) > 0){
            System.out.println("p1 es mayor que p2");
        }else{
            System.out.println("p1 es menor que p2");
        }

    }
    
}