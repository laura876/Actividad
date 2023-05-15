import java.util.*;

public class InventarioChaqueta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> inventario = new HashMap<>();
        String tipoMarca, respuesta;
        int cantidad;
        do {
            System.out.println("MENU DE INVENTARIO DE CHAQUETAS");
            System.out.println("1. Ingrese el tipo de marca que quiere agregar");
            System.out.println("2. Ingrese la cantidad de chaquetas de la marca 'el nombre'");
            System.out.println("3. Desea agregar otra marca si o no");
            System.out.println("4. Ingrese otra cantidad de tipo de marca 'el nombre'");
            System.out.println("5. Visualizar el inventario total.");
            System.out.print("Ingrese su opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tipo de marca que quiere agregar: ");
                    tipoMarca = sc.nextLine();
                    inventario.put(tipoMarca, 0); // agregar la marca al inventario con cantidad inicial 0
                    System.out.println("Se ha agregado la marca '" + tipoMarca + "' al inventario.");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de chaquetas de la marca 'el nombre': ");
                    cantidad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el tipo de marca: ");
                    tipoMarca = sc.nextLine();
                    if (inventario.containsKey(tipoMarca)) { // verificar si la marca ya está en el inventario
                        inventario.put(tipoMarca, inventario.get(tipoMarca) + cantidad); // agregar la cantidad a la marca existente
                        System.out.println("Se ha agregado " + cantidad + " chaquetas de la marca '" + tipoMarca + "' al inventario.");
                    } else {
                        System.out.println("La marca '" + tipoMarca + "' no existe en el inventario.");
                    }
                    break;
                case 3:
                    System.out.print("Desea agregar otra marca? (si/no): ");
                    respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("si")) {
                        System.out.print("Ingrese el tipo de marca que quiere agregar: ");
                        tipoMarca = sc.nextLine();
                        inventario.put(tipoMarca, 0);
                        System.out.println("Se ha agregado la marca '" + tipoMarca + "' al inventario.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de tipo de marca 'el nombre': ");
                    cantidad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el tipo de marca: ");
                    tipoMarca = sc.nextLine();
                    if (inventario.containsKey(tipoMarca)) {
                        inventario.put(tipoMarca, cantidad); // actualizar la cantidad de la marca existente
                        System.out.println("Se ha actualizado la cantidad de la marca '" + tipoMarca + "' en el inventario.");
                    } else {
                        System.out.println("La marca '" + tipoMarca + "' no existe en el inventario.");
                    }
                    break;
                case 5:
                System.out.println("Inventario total:");
                for (String key : inventario.keySet()) { // recorrer todas las marcas en el inventario
                System.out.println("- " + key + ": " + inventario.get(key)); // mostrar el tipo de marca y su cantidad
                }
                break;
                default:
                System.out.println("Opción inválida.");
                break;
                }
                } while (true);
                }
                }
                                