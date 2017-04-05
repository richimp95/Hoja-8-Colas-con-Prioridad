/**
 * Universidad del Valle de Guatemala
 * Texto.java
 * Algoritmos y Estructura de Datos - Seccion 10
 * Maria Fernanda Estrada y Ricardo Miranda
 * @since 4 abril 2017
 */




import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Texto {
		
	FileReader fr;
	BufferedReader bf;
	
	
	public Texto() throws FileNotFoundException {
		fr = new FileReader("pacientes.txt");
		bf = new BufferedReader(fr);
	}
	
	
	public void close() throws IOException {
		bf.close();
	}
	

	public void Leer(VectorHeap<Paciente<String, String, String>> v) throws IOException {
		
		String cadena1;
		
		// Leer los datos del paciente
		while((cadena1=bf.readLine())!=null) {			
			String[] datos = cadena1.split("\\s*,\\s*");
			// Guardar en el VectorHeap
			v.add(new Paciente<String,String,String>(datos[0], datos[1], datos[2]));
			System.out.println(cadena1);
		}

}

}
