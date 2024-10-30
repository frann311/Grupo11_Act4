
package tp4;

/**
 * @author Fran
 * @version 1.0
 * @created 30-oct.-2024 11:09:24
 */
public class Auto {

	private double combustible = 50;
	private String modelo;
	private String patente;

	public Auto(String patente, String modelo, double combustible) {
        this.patente = patente;
        this.modelo = modelo;
        this.combustible = combustible;
    }

            
    public String getModelo() {
        return this.modelo;
    }

    public String getPatente() {
        return this.patente;
    }
	
}//end Auto