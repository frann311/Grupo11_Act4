package tp4;


/**
 * @author Fran
 * @version 1.0
 * @created 30-oct.-2024 11:09:24
 */
public class Padre {

	private String apellido = "Lopez";
	private Auto auto;
	private Casa casa;
	private String nombre = "Papa";

	public Padre(){
        this.casa = new Casa("Centro");
        this.auto = new Auto("AE678QZ", "Ford Focus", 50);
	}

	public Casa getCasa() {
            return this.casa;
    }

	public void cantar(){
            System.out.println("Asa canta tu padre, Don " + apellido);
	}


	public void comprarAuto(Auto auto){
            this.auto = auto;
	}

	public Casa construirCasa(){
		return this.casa;
	}
}//end Padre