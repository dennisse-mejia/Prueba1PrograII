/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dennisse
 */
public class RentItem {

    //Atributos 
    private String codigoItem;
    private String nombreItem;
    private double precioItem;
    private int cantidadCopias;

    public RentItem(String codigoItem, String nombreItem, double precioItem) {
        this.codigoItem = codigoItem;
        this.nombreItem = nombreItem;
        this.precioItem = precioItem;
        this.cantidadCopias = 0;
    }

    //Funcion toString
    public String toString() {
        return "Código: " + codigoItem + "\nNombre: " + nombreItem + "\nPrecio Renta L." + precioItem + "\nCantidad Copias: " + cantidadCopias;
    }

    //Funcion pagoRenta
    public double pagoRenta(int dias) {
        return 0;
    }

    //Gettters para los 4 atributos
    public String getCodigoItem() {
        return codigoItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public double getPrecioItem() {
        return precioItem;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    //Funcion subMenu
    public String subMenu() {
        return "1-Imprimir";
    }

    //Funcion ejecutarOpcion
    public void ejecutarOpcion(int opcion) {
        if (opcion == 1) {
            System.out.println(this.toString());
        } else {
            System.out.println("Opción No Válida");
        }
    }

}
