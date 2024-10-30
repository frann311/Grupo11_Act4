/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Fran
 */
public class Tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // 1. Crear los objetos Auto y Celular
        Auto cascajo = new Auto("123LATA", "Renault 12", 50.0);
        Auto fordFocus = new Auto("999POWR", "Ford Focus", 50.0);  // auto de un amigo
        Celular celularJuan = new Celular("Movistar", 111222333, 100.0);

        // 2. Crear un objeto del Padre
        Padre padre = new Padre();
        System.out.println("Papa me dejo esta casa en zona: " + padre.getCasa().getZona());
        
        // 3. Crear un objeto del Hijo (Juan Carlos) con su celular (sin auto propio)
        Hijo juanCarlos = new Hijo("Juan Carlos", celularJuan);
        
        // 4. Ejecutar el método conducirAuto con el auto de un amigo (Ford Focus)
        juanCarlos.conducirAuto(fordFocus);  // Ya no usa cascajo
        
        // 5. Ejecutar el método jugarFutbol() y mostrar la habilidad adquirida del hermano
        juanCarlos.jugarFutbol();
        
        // 6. Ejecutar el método bailar() (heredado de la madre)
        juanCarlos.bailar();
        
        // 7. Ejecutar el método jugarLoteria() y mostrar el número de la suerte y la fortuna heredada de la madre
        int numeroSuerte = juanCarlos.jugarLoteria();
        System.out.println("SALIO EL NUMERO DE LA SUERTE: " + numeroSuerte);
        System.out.println("Herencia total en la billetera de Juan Carlos: " + juanCarlos.getBilletera());
        
        // 8. Ejecutar el método cantar() que sobreescribe el de Padre
        juanCarlos.cantar();
        
        // 9. Ejecutar el método heredarDinero() del tío y mostrar el aumento en la billetera
        juanCarlos.heredarDinero(2000);  // El tío le regala 2000 dólares
        System.out.println("Tio Lucas te regala estos dolaritos! Nueva billetera: " + juanCarlos.getBilletera());
        
        // 10. Ejecutar el método hacerGoles() para ver cuántos goles hace Juan Carlos
        int goles = juanCarlos.hacerGoles();
        System.out.println("Jugando al Futbol, Hoy has hecho " + goles + " goles.");
    }
    
}
