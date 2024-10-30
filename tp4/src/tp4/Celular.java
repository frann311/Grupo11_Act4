package tp4;

public class Celular {

	private String compania;
	private int numero;
	private double saldo;

	public Celular(String compania, int numero, double saldo) {
        this.compania = compania;
        this.numero = numero;
        this.saldo = saldo;
        }

	    public String getCompania() {
        return this.compania;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }
}//end Celular