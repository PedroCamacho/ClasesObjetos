public class Ejemplo3 {
	String palabra = "Descubriendo JavaDoc";
	
	int getLongitud () {
		return palabra.length();
	}
	
	void setPalabra (String nueva) {
		palabra = nueva;
	}
	
	public static void main(String[] args) {
		Ejemplo3 miPalabra = new Ejemplo3();
		System.out.println("La longitud es: " + miPalabra.getLongitud());
		miPalabra.setPalabra("corto");
		System.out.println("La nueva longitud es: " + miPalabra.getLongitud());	
	}
}
