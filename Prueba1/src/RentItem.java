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
    private double precioRenta;
    private int cantidadCopias;

    public RentItem(String codigoItem, String nombreItem, double precioRenta) {
        this.codigoItem = codigoItem;
        this.nombreItem = nombreItem;
        this.precioRenta = precioRenta;
        this.cantidadCopias = 0;
    }
    
    

}
