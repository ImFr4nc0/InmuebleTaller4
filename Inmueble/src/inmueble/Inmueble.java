/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inmueble;

/**
 *
 * @author jorge
 */
public class Inmueble {

    
    protected int identificadorInmobiliario;
    protected int área;
    protected String dirección; 
    protected double precioVenta;
    Inmueble(int identificadorInmobiliario, int área, String dirección) {
    this.identificadorInmobiliario = identificadorInmobiliario;
    this.área = área;
    this.dirección = dirección;
    
}
    double calcularPrecioVenta(double valorArea) {
    precioVenta = área * valorArea;
    return precioVenta;
    }
    void imprimir() {
System.out.println("Identificador inmobiliario = " +identificadorInmobiliario);
System.out.println("Area ="  + área);
System.out.println("Dirección = " + dirección);
System.out.println("Precio de venta = $" + precioVenta);
}
    public static void main(String[] args) {
       ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067,120,"Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos apartamento");
        apto1.calcularPrecioVenta(apto1.valorArea);
        apto1.imprimir();
        System.out.println("Datos apartamento");
        Apartaestudio aptestudio1 = new Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
        aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
        aptestudio1.imprimir();
            }
    
}
