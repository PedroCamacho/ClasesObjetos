import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo1 {
	
	public static void main(String[] args) {
		int [] lista1 = {1,2,3,4,5};
		ArrayList <Integer> lista2 = new ArrayList<>();
		lista2.addAll(Arrays.asList(1,2,3,4,5));
		
		System.out.print("Ejemplo de atributo - ");
		System.out.println("Logitud del array: " + lista1.length);
		
		System.out.print("Ejemplo de método - ");
		System.out.println("Cantidad de elementos : " + lista2.size());
	}
}
