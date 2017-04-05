/**
 * Universidad del Valle de Guatemala
 * PriorityQueue.java
 * Algoritmos y Estructura de Datos - Seccion 10
 * Maria Fernanda Estrada y Ricardo Miranda
 * @since 4 abril 2017
 */



public interface PriorityQueue<E extends Comparable<E>> {
	
	// pre: no esta vacio
	// post: regresa el valor mas pequeno
	public E getFirst();
	
	// pre: no esta vacio
	// post: regresa y elimina el valor mas pequeno
	public E remove();
	
	// pre: el valor no es nulo
	// post: se agrega al queue
	public void add(E value);
	
	// post: regresa true si no hay elementos en el queue
	public boolean isEmpty();
	
	// post: regresa el numero de elementos en el queue
	public int size();
	
	// post: elimina todos los elementos del queue
	public void clear();

}
