public class Ejemplo2 {
	double gasolina = 40;
	double consumoMedio = 5;

	void conducir(int distancia) {
		double consumoParcial = (distancia * consumoMedio)/100;
		gasolina = gasolina - consumoParcial;
	}

	double getGasolina() {
		return gasolina;
	}

	public static void main(String[] args) {
		Ejemplo2 coche = new Ejemplo2();
		coche.conducir(100);
		System.out.printf("Te quedan %.2f litros de gasolina", coche.getGasolina());
	}
}
