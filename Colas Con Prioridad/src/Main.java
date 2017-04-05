/**
 * Universidad del Valle de Guatemala
 * Main.java
 * Algoritmos y Estructura de Datos - Seccion 10
 * Maria Fernanda Estrada y Ricardo Miranda
 * @since 4 abril 2017
 */




import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		
		// Variables
		Texto text = new Texto();
		VectorHeap<Paciente<String, String, String>> v = new VectorHeap<>();
		
		// Lee el archivo de texto e ingresa los datos del paciente a un VectorHeap
		text.Leer(v);
		text.close();
		
		System.out.println();
		
		// Muestra el heap ya ordenado
		v.mostrar();
		
	}

}
