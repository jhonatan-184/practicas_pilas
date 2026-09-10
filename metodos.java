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
            if (opt == 2) {
                continuar = false;
            }

        }
        return pila;

    }
}
