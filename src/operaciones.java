
public class operaciones {

	double moneda;

	public operaciones(double moneda) {
		super();
		this.moneda = moneda;
	}

	public double getMoneda() {
		return moneda;
	}

	public void setMoneda(double moneda) {
		this.moneda = moneda;
	}

	// metodos calculos
	// De pesos a dolar
	public double dolar(double moneda) {
		double tasaCambio = 4837.40;
		double cambio = moneda / tasaCambio;
		return cambio;
	}

	// De pesos a euros
	public double euro(double moneda) {
		double tasaCambio = 5087.00;
		double cambio = moneda / tasaCambio;
		return cambio;
	}

	// De pesos a euros
	public double libras(double moneda) {
		double tasaCambio = 4784.50;
		double cambio = moneda / tasaCambio;
		return cambio;
	}

	// De pesos a Yen
	public double yen(double moneda) {
		double tasaCambio = 0.21;
		double cambio = moneda / tasaCambio;
		return cambio;
	}

	// De pesos a won coreano
	public double won(double moneda) {
		double tasaCambio = 23.64;
		double cambio = moneda / tasaCambio;
		return cambio;
	}

	// De pesos a dolar
	public double pesosDolar(double moneda) {
		double tasaCambio = 4837.40;
		double cambio = moneda * tasaCambio;
		return cambio;
	}

	// De euros a pesos
	public double euroPesos(double moneda) {
		double tasaCambio = 5087.00;
		double cambio = moneda * tasaCambio;
		return cambio;
	}

	// De libras a pesos
	public double librasPesos(double moneda) {
		double tasaCambio = 4784.50;
		double cambio = moneda * tasaCambio;
		return cambio;
	}

	// De yen a pesos
	public double yenPesos(double moneda) {
		double tasaCambio = 0.21;
		double cambio = moneda * tasaCambio;
		return cambio;
	}

	// De yen a pesos
	public double wonPesos(double moneda) {
		double tasaCambio = 23.64;
		double cambio = moneda * tasaCambio;
		return cambio;
	}

}
