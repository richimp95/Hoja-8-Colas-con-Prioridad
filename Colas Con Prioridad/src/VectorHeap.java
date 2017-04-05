/**
 * Universidad del Valle de Guatemala
 * VectorHeap.java
 * Algoritmos y Estructura de Datos - Seccion 10
 * Maria Fernanda Estrada y Ricardo Miranda
 * @since 4 abril 2017
 */



import java.util.Arrays;
import java.util.Vector;


public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
	
	// Variable donde se guardaran los datos de paciente
	protected Vector<E> data;

	
	/**
	 * Constructor
	 */
	public VectorHeap() {
		data = new Vector<E>();
	}

	
	/**
	 * Metodo para saber quien es el padre
	 * @param i Valor del nodo a analizar
	 * @return La posicion del padre
	 */
	protected static int parent(int i) {
		return (i-1)/2;
	}

	
	/**
	 * Metodo para saber quien es el nodo izquierdo
	 * @param i Valor del nodo a analizar
	 * @return La posicion del nodo izquierdo
	 */
	protected static int left(int i) {
		return 2*i+1;
	}
	
	
	/**
	 * Metodo para saber quien es el nodo derecho
	 * @param i Valor del nodo a analizar
	 * @return La posicion del nodo derecho
	 */
	protected static int right(int i) {
		return (2*i+1) + 1;
	}
	
	/**
	 * Llevar el nodo mas pequeno hasta arriba
	 * @param leaf El nodo que acaba de ingresar
	 */
	protected void percolateUp(int leaf) {
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)) {
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}
	
	
	/**
	 * Metodo para cambiar la raiz si se elimina un elemento
	 * @param root Nodo mas pequeno
	 */
	protected void pushDownRoot(int root) {
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize) {
				if ((right(root) < heapSize) && ((data.get(childpos+1)).compareTo(data.get(childpos)) < 0)) {
					childpos++;
				}
			if ((data.get(childpos)).compareTo(value) < 0) {
				data.set(root,data.get(childpos));
				root = childpos;
			} else {
				data.set(root,value);
				return;
			}
			} else {
				data.set(root,value);
				return;
			}
		}
	}

	
	/**
	 * Metodo para mostrar el vector
	 */
	public void mostrar() {
		Object[] array = data.toArray();
		Arrays.sort(array);
		for (int i=0; i<data.size();i++) {
			System.out.print(array[i]);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public E getFirst() {
		Object[] array = data.toArray();
		Arrays.sort(array);
		return (E)array[0];
	}

	
	@Override
	public E remove() {
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}

	
	@Override
	public void add(E value) {
		data.add(value);
		percolateUp(data.size()-1);
	}

	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return data.isEmpty();
	}

	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}

	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		data.clear();
	}

}