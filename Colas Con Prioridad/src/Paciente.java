/**
 * Universidad del Valle de Guatemala
 * Paciente.java
 * Algoritmos y Estructura de Datos - Seccion 10
 * Maria Fernanda Estrada y Ricardo Miranda
 * @since 4 abril 2017
 */



public class Paciente<A,B, C extends Comparable<C>> implements Comparable<Paciente<A,B,C>> {

	// Variables
	protected A nombrePaciente;
	protected B sintoma;
	protected C codigoEmergencia;

	// Constructor
	public Paciente(A name, B symptom, C code) {
		nombrePaciente = name;
		sintoma = symptom;
		codigoEmergencia = code;
	}
	
	// Metodo equals
	public boolean equals(Object other) {
        @SuppressWarnings("unchecked")
		Paciente<A, B, C> otherAssoc = (Paciente<A, B, C>)other;
        return getCode().equals(otherAssoc.getCode());
    }
	
	// Getters
	public A getName() {
        return nombrePaciente;
    }
	public B getSintoma() {
        return sintoma;
    }
	public C getCode() {
        return codigoEmergencia;
    }
	
	// String para imprimir los datos del paciente
	public String toString() {
        StringBuffer s = new StringBuffer();
        s.append(""+ getName() +", "+ getSintoma() +", "+ getCode() +"\n");
        return s.toString();
    }
	
	// Comparar el codigo de emergencia de los pacientes
	@Override
	public int compareTo(Paciente<A, B, C> arg0) {
		return codigoEmergencia.compareTo(arg0.getCode());
	}

}