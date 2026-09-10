import java.util.Scanner;
import java.util.Stack;

public class metodos {
    /* visitar una nueva pagina */

    public Stack<ObjpaginaWeb> visitar(Stack<ObjpaginaWeb> pila, Scanner sc) {
        boolean continuar = true;
        while (continuar) {
            ObjpaginaWeb o = new ObjpaginaWeb();
            System.out.println("Ingrese la url de la pagina que dese visitar: ");
            String URL = sc.next();
            System.out.println("Ingrese el titulo de la pagina: ");
            String Titulo = sc.next();
            System.out.println("Ingrese la fecha de acceso: ");
            String FechaAcceso = sc.next();
            pila.push(o);
            System.out.println("¿desea visitar mas paginas? si 1, no 2 ");
            int opt = sc.nextInt();
            System.out.println("============//======//=========");

            o.setURL(URL);
            o.setTitulo(Titulo);
            o.setFechaAcceso(FechaAcceso);

            if (opt == 2) {
                continuar = false;
            }

        }
        return pila;

    }

    public void actual(Stack<ObjpaginaWeb> pila){
        ObjpaginaWeb o = pila.peek();
        System.out.println("la pagina actual es:\n");
        System.out.println("URL: " + o.getURL());
        System.out.println("Titulo: " + o.getTitulo());
        System.out.println("Fecha de Aceso: " + o.getFechaAcceso());
    }

    public void retroceder(Stack<ObjpaginaWeb> pila){
        
        ObjpaginaWeb o = new ObjpaginaWeb();
        o = pila.pop();
        o=pila.peek();


        System.out.println("ahora esta en:\n");
        System.out.println("URL: " + o.getURL());
        System.out.println("Titulo: " + o.getTitulo());
        System.out.println("Fecha de Aceso: " + o.getFechaAcceso());

    }

     public void Historial(Stack<ObjpaginaWeb> pila) {
        for (ObjpaginaWeb o : pila) {
            System.out.println("URL: " + o.getURL());
            System.out.println("Titulo: " + o.getTitulo());
            System.out.println("Fecha de Aceso: " + o.getFechaAcceso());
            System.out.println("------------------\n");
        }
    }
    
}
