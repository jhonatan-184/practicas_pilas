import java.util.Scanner;
import java.util.Stack;

public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<ObjpaginaWeb> pila = new Stack<>();
        metodos m = new metodos();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu: \n");
            System.out.println("1- Visitar pagina");
            System.out.println("2- pagina actual");
            System.out.println("3- Retroceder");
            System.out.println("4- Ver Historial");
            System.out.println("5- Salir");
            int opt = m.validar(sc);
            switch (opt) {
                case 1:
                    m.visitar(pila, sc);
                    break;
                case 2:
                    m.actual(pila);
                    break;
                case 3:
                    m.retroceder(pila);
                    break;
                case 4:
                    m.Historial(pila);
                    
                    break;
                case 5:
                    continuar = false;
                    break;

            
                default:
                    System.out.println("Fastidioso");
                    break;
            }
            
        }

    }
    
}
