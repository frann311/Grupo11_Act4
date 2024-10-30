package tp4;


/**
 * @author Fran
 * @version 1.0
 * @created 30-oct.-2024 11:09:24
 */
public class Hijo extends Padre implements Madre, Tio, Hermano {

	private double billetera;
	private Celular celular;
	private String nombre;

	public Hijo(String nombre, Celular celular) {
        super(); 
        this.nombre = nombre;
        this.celular = celular;
        this.billetera = 0.0; 
    }

	

	@Override
        public void cantar() {
        super.cantar();
        System.out.println("Asi canta " + nombre + ": y asi canta Juan Carlos.");
    }

        public void bailar() {
        System.out.println(nombre + " esta bailando como su madre.");
    }


	public void conducirAuto(Auto auto) {
        System.out.println(nombre + " esta conduciendo el auto de un amigo: " + auto.getModelo() + ", patente: " + auto.getPatente());
    }

	public int hacerGoles(){
	int goles = (int) (Math.random() * 5); 
        System.out.println(nombre + " ha hecho " + goles + " goles.");
        return goles;
	}

	/**
	 * 
	 * @param dinero    dinero
	 */
	public void heredarDinero(double dinero){
        this.billetera += dinero; 
        System.out.println(nombre + " ha heredado " + dinero + " dolares del tio.");
	}

	public void jugarFutbol(){
                System.out.println(nombre + " esta jugando al futbol gracias a su hermano.");
	}

	public int jugarLoteria(){
        System.out.println("Salio el numero de la suerte de mama.");
        this.billetera += 50000.0; 
        System.out.println("Heredaste la Fortuna de 50000.0 de tu madre, la rosa!!");
        return 36; 
	}
        
    public double getBilletera() {
        return billetera;
    }

    public Celular getCelular() {
        return celular;
    }

    public String getNombre() {
        return nombre;
    }
}//end Hijo