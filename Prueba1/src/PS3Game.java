
import java.util.Calendar;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dennisse
 */
public class PS3Game extends RentItem {

    Scanner lea = new Scanner(System.in);

    private Calendar fechaPubli;

    public PS3Game(String codigoItem, String nombreItem) {
        super(codigoItem, nombreItem, 30);
        this.fechaPubli = Calendar.getInstance();
    }

    public Calendar getFechaPublicacion() {
        return fechaPubli;
    }

    public void setFechaPubli(int anio, int mes, int dia) {
        fechaPubli.set(anio, mes, dia);
    }

    public String toString() {
        return super.toString() + " – Fecha de Publicación: " + fechaPubli.getTime() + " – PS3 Game";
    }

    public double pagoRenta(int dias) {
        return getPrecioItem() * dias;
    }

    public String subMenu() {
        return super.subMenu() + "\n2-Actualizar Fecha de Publicacion";
    }

    public void ejecutarOpcion(int opcion) {
        if (opcion == 1) {
            System.out.println(this.toString());
        } else if (opcion == 2) {
            System.out.print("Año: ");
            int anio = lea.nextInt();
            System.out.print("Mes: ");
            int mes = lea.nextInt();
            System.out.print("Día: ");
            int dia = lea.nextInt();
            setFechaPubli(anio, mes, dia);
        } else {
            System.out.println("OPCION NO VALIDA");
        }
    }
}
