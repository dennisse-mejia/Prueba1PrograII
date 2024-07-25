
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dennisse
 */
public class Movie extends RentItem {

    Scanner lea = new Scanner(System.in);

    private String estado;

    public Movie(String codigoItem, String nombreItem, double precioItem) {
        super(codigoItem, nombreItem, precioItem);
        this.estado = "ESTRENO";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return super.toString() + "Estado: " + estado + " - movie";
    }

    public double pagoRenta(int dias) {
        double pago = getPrecioItem();
        if (estado.equals("ESTRENO") && dias > 2) {
            pago = pago + (dias - 2) * 50;
        } else if (!estado.equals("ESTRENO") && dias > 5) {
            pago = pago + (dias - 5) * 30;
        }
        return pago;

    }

    public String subMenu() {
        return super.subMenu() + "\n2-Cambiar Estado";
    }

    public void ejecutarOpcion(int opcion) {

        if (opcion == 1) {
            System.out.println(this.toString());
        } else if (opcion == 2) {
            System.out.print("NUEVO ESTADO: ");
            String nuevoEstado = lea.nextLine();
            setEstado(nuevoEstado);
        } else {
            System.out.println("OPCION NO VALIDA");
        }
    }
}
