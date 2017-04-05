/**
 * Universidad del Valle de Guatemala
 * VectorHeapTest.java
 * Algoritmos y Estructura de Datos - Seccion 10
 * Maria Fernanda Estrada y Ricardo Miranda
 * @since 4 abril 2017
 */



import static org.junit.Assert.*;
import org.junit.Test;


public class VectorHeapTest {

	
	VectorHeap<Paciente<String, String, String>> v = new VectorHeap<>();
	
	// Probando si agrega un elemento al vector
	@Test
	public void testadd() {
		v.add(new Paciente<String,String,String>("Luis Perez", "enfermedad1", "D"));
		v.add(new Paciente<String,String,String>("Juan Perez", "enfermedad2", "A"));
		boolean tamano = v.isEmpty();
		assertEquals("Se prueba que agregue un elemento al vector", tamano, false);
	}
	
	
	// Probando si elimina un elemento del vector
	@Test
	public void testremove() {
		v.add(new Paciente<String,String,String>("Luis Perez", "enfermedad1", "D"));
		v.add(new Paciente<String,String,String>("Juan Perez", "enfermedad2", "A"));
		Paciente<String, String, String> r = v.remove();
		String letra = r.getCode();
		assertEquals("Se prueba que elimine un elemento del vector", letra.equals("A"), true);
	}

}