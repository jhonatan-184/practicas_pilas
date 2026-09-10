import java.util.Scanner;
import java.util.Stack;

public class metodos {
    /* visitar una nueva pagina */

    public Stack<ObjpaginaWeb> visitar(Stack<ObjpaginaWeb> pila, Scanner sc) {
        boolean continuar = true;
        metodos m = new metodos();
        while (continuar) {
            ObjpaginaWeb o = new ObjpaginaWeb();
            System.out.println("\nIngrese la url de la pagina que dese visitar: ");
            String URL = sc.next();
            System.out.println("Ingrese el titulo de la pagina: ");
            String Titulo = sc.next();
            System.out.println("Ingrese la fecha de acceso: ");
            String FechaAcceso = sc.next();
            pila.push(o);
            System.out.println("¿desea visitar mas paginas? si 1, no 2 ");
            int opt = m.validar(sc);
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
        ObjpaginaWeb o = new ObjpaginaWeb();
        if (!pila.isEmpty()) {
            o= pila.peek();
            System.out.println("\nla pagina actual es:\n");
            System.out.println("URL: " + o.getURL());
            System.out.println("Titulo: " + o.getTitulo());
            System.out.println("Fecha de Aceso: " + o.getFechaAcceso());
            
        }
        if (pila.isEmpty()) {
            System.out.println("\nno has visitado paginas");
        }

        
    }

    public void retroceder(Stack<ObjpaginaWeb> pila){
        ObjpaginaWeb o = new ObjpaginaWeb();
        if (pila.size() <= 1) {
            System.out.println("\nya no hay mas a donde retroceder");
            return ;
        } 
        
        
            
            pila.pop();
            o=pila.peek();


            System.out.println("\nahora esta en:\n");
            System.out.println("URL: " + o.getURL());
            System.out.println("Titulo: " + o.getTitulo());
            System.out.println("Fecha de Aceso: " + o.getFechaAcceso());
        

        

    }

     public void Historial(Stack<ObjpaginaWeb> pila) {

        if(!pila.isEmpty()){
            for (ObjpaginaWeb o : pila) {
                System.out.println("\nURL: " + o.getURL());
                System.out.println("Titulo: " + o.getTitulo());
                System.out.println("Fecha de Aceso: " + o.getFechaAcceso());
                System.out.println("------------------\n");
            }

            
        }

        if (pila.isEmpty()) {
                System.out.println("\nno has visitado paginas");
            }

        
    }

    public int validar(Scanner sc){
        while (!sc.hasNextInt()) {
            System.out.println("Que sea un numero entero de los que se te estan indicando");
            sc.next();
            
        }
        return sc.nextInt();
    }
    
}
