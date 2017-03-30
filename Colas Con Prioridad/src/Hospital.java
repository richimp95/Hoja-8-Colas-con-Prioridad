import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hospital {
	public Hospital() throws IOException{
		VectorHeap vector=new VectorHeap();
		BufferedReader leer = null;
		Paciente p=new Paciente();
		try {
			String nombre;
			String sintoma;
			String palabra;
			String prioridad;
			char c;
			int num;
			
			leer = new BufferedReader(new FileReader("pacientes.txt"));
			String cadena= leer.readLine();
			do{
				nombre="";
				sintoma="";
				prioridad="";
				palabra="";
				num=0;
				
				for (int i=0;i<cadena.length();i++){
					c=cadena.charAt(i);
					if(c==','){
						num++;
					}
					if(c==' '){
						if(num==0){
							nombre=palabra;
						}
						if(num==1){
							sintoma=palabra;
						}
						if(num==2){
							prioridad=palabra;
						}
					}else{
						palabra=palabra+c;
					}
					
				}
				p.setNombre(nombre);
				p.setSintoma(sintoma);
				p.setPrioridad(prioridad);
				
			}while(cadena!=null);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//cargar archivo		
		leer.close();
	}
}
