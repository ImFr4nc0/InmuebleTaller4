/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmueble;
/**
* Esta clase denominada Casa modela un tipo específico de inmueble
* destinado para la vivienda con atributos como el número de pisos
* que tiene una casa.
* @version 1.2/2020
*/
public class Casa extends InmuebleVivienda {
protected int númeroPisos; 
public Casa(int identificadorInmobiliario, int área, String dirección,
int númeroHabitaciones, int númeroBaños, int númeroPisos) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, área, dirección,
númeroHabitaciones, númeroBaños);
this.númeroPisos = númeroPisos;
}
/**
* Método que muestra en pantalla los datos de una casa
*/
void imprimir() {
super.imprimir(); 
System.out.println("Número de pisos = " + númeroPisos);
}
}
