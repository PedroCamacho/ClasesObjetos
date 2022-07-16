public class Ejemplo4 {
	double gasolina;
	double consumoMedio;

	void conducir(int distancia) {
		double consumoParcial = (distancia * consumoMedio)/100;
		gasolina = gasolina - consumoParcial;
	}

	void setGasolina (double gas) {
		gasolina=gas;
	}
	
	void setConsumo (double media) {
		consumoMedio = media;
	}
	
	double getGasolina() {
		return gasolina;
	}

	public static void main(String[] args) {
		Ejemplo4 smart = new Ejemplo4();
		Ejemplo4 hammer = new Ejemplo4();
		smart.setConsumo(5);
		smart.setGasolina(50);
		smart.conducir(100);
		hammer.setConsumo(10);
		hammer.setGasolina(90);
		hammer.conducir(100);
		System.out.println("Combustible Smart: " + smart.getGasolina());
		System.out.println("Combustible Hammer: " + hammer.getGasolina());
	}
}
