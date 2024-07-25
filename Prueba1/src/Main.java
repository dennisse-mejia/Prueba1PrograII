
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dennisse
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<RentItem> items = new ArrayList<>();
        Scanner lea = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-- Menú Principal --");
            System.out.println("1. Agregar Item");
            System.out.println("2. Calcular Renta");
            System.out.println("3. Ejecutar Sub-Menú");
            System.out.println("4. Imprimir Todo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lea.nextInt();
            lea.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarItem(items, lea);
                    break;
                case 2:
                    calcularRenta(items, lea);
                    break;
                case 3:
                    ejecutarSubMenu(items, lea);
                    break;
                case 4:
                    imprimirTodo(items);
                    break;
                case 5:
                    System.out.println("Nos vemos pronto!");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (opcion != 5);
    }

    private static void agregarItem(ArrayList<RentItem> items, Scanner lea) {
        System.out.print("Ingrese el tipo de Item (MOVIE/PS3): ");
        String tipo = lea.nextLine().toUpperCase();
        System.out.print("Código: ");
        String codigo = lea.nextLine();
        System.out.print("Nombre: ");
        String nombre = lea.nextLine();

        if (tipo.equals("MOVIE")) {
            System.out.print("Precio de Renta L.");
            double precio = lea.nextDouble();
            lea.nextLine();
            items.add(new Movie(codigo, nombre, precio));
        } else if (tipo.equals("PS3")) {
            items.add(new PS3Game(codigo, nombre));
        } else {
            System.out.println("TIPO INCORRECTO");
        }
    }

    private static void calcularRenta(ArrayList<RentItem> items, Scanner scanner) {
        System.out.print("Ingrese el código del Item: ");
        String codigo = scanner.nextLine();
        RentItem item = buscarItem(items, codigo);

        if (item != null) {
            System.out.println(item);
            System.out.print("Ingrese los días de renta: ");
            int dias = scanner.nextInt();
            scanner.nextLine();
            double pago = item.pagoRenta(dias);
            System.out.println("Monto a Pagar L." + pago);
        } else {
            System.out.println("Item No Existe");
        }
    }

    private static void ejecutarSubMenu(ArrayList<RentItem> items, Scanner scanner) {
        System.out.print("Ingrese el código del Item: ");
        String codigo = scanner.nextLine();
        RentItem item = buscarItem(items, codigo);

        if (item != null) {
            System.out.println(item.subMenu());
            System.out.print("Escoja Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            item.ejecutarOpcion(opcion);
        } else {
            System.out.println("Item No Existe");
        }
    }

    private static void imprimirTodo(ArrayList<RentItem> items) {
        for (RentItem item : items) {
            System.out.println(item);
        }
    }

    private static RentItem buscarItem(ArrayList<RentItem> items, String codigo) {
        for (RentItem item : items) {
            if (item.getCodigoItem().equals(codigo)) {
                return item;
            }
        }
        return null;
    }

}
