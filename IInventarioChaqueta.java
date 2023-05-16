import java.util.Scanner;

public class IInventarioChaqueta {
    static Scanner sc = new Scanner(System.in);
    static String[] marcas = new String[50];
    static int[] cantidades = new int[50];
    static int totalChaquetas = 0;

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        int opcion=0; 
        boolean opcionValida = false;
        
        do {
            System.out.println("          MENU DE INVENTARIO DE CHAQUETAS       ");
            System.out.println("1. Ingrese el tipo de marca que quiere agregar.");
            System.out.println("2. Ingrese otra cantidad de chaquetas de las cuales se encuentren creadas en el inventario.");
            System.out.println("3. Desea agregar otra marca si o no.");
            System.out.println("4. Ingrese otra cantidad con el tipo de marca.");
            System.out.println("5. Visualizar inventario total.");
            System.out.println("6. Salir.");


            while (!opcionValida) {
                System.out.print("Ingrese su opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion >= 1 && opcion <= 6) {
                    opcionValida = true;
                } else {
                    System.out.println("Opción no válida. Intento de nuevo.");
                }
            }
            
            opcionValida = false;

            switch (opcion) {
                case 1:
                    inventario.agregarMarca();
                    break;
                case 2:
                    inventario.agregarCantidad();
                    break;
                case 3:
                    inventario.preguntarAgregarMarca();
                    break;
                case 4:
                    inventario.actualizarCantidad();
                    break;
                case 5:
                    inventario.visualizarInventario();
                    break;
                case 6:
                   System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 6);
    }

    static void agregarMarca() {
        System.out.print("Ingrese el tipo de marca que quiere agregar: ");
        String marca = sc.nextLine();
        marcas[totalChaquetas] = marca;
        cantidades[totalChaquetas] = 0;
        totalChaquetas++;
        System.out.println("Se ha agregado la marca '" + marca + "' al inventario.");
    }

    static void agregarCantidad() {
        System.out.print("Ingrese el tipo de marca: ");
        String marca = sc.nextLine();
        int indice = -1;

        for (int i = 0; i < totalChaquetas; i++) {
            if (marcas[i].equalsIgnoreCase(marca)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("La marca '" + marca + "' no existe en el inventario. Por favor agregue la marca primero.");
        } else {
            System.out.print("Ingrese la cantidad a agregar: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            cantidades[indice] += cantidad;
            System.out.println("Se han actualizado las cantidades de la marca " + marca);
        }
    }
    
        static void preguntarAgregarMarca() {
        String respuesta;
        do {
            System.out.print("Desea agregar otra marca? (si/no): ");
            respuesta = sc.nextLine();
        } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
        if (respuesta.equalsIgnoreCase("si")) {
            agregarMarca();
        }
    }
    
       static void actualizarCantidad(){
        System.out.print("Ingrese el tipo de marca: ");
        String marca = sc.nextLine();
        int indice = -1;
        for (int i = 0; i < totalChaquetas; i++) {
            if (marcas[i].equalsIgnoreCase(marca)) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            System.out.println("La marca ingresada no se encuentra en el inventario.");
        } else {
        System.out.print("Ingrese la cantidad a agregar: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); 
        cantidades[indice] += cantidad;
        System.out.println("Se han actualizado las cantidades de la marca " + marca);
        }
        }

    static void visualizarInventario() {
        System.out.println("     Inventario de chaquetas   ");
        for (int i = 0; i < totalChaquetas; i++) {
            System.out.println(marcas[i] + ": " + cantidades[i]);
            
        }
    }
} 
class Inventario {
    private String[] marcas = new String[50];     
    private int[] cantidades = new int[50];     
    private int totalChaquetas = 0;     

}

