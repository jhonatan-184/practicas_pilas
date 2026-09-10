

public class menu {

    public static void main(String[] args) {
  
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu: \n");
            System.out.println("1- Visitar pagina");
            System.out.println("2- Retroceder");
            System.out.println("3- Ver Historial");
            System.out.println("4- Salir");
            int opt = 1;
            switch (opt) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("mantenimiento");
                    
                    break;
                case 4:
                    continuar = false;
                    break;

            
                default:
                    System.out.println("Fastidioso");
                    break;
            }
            
        }

    }
    
}
