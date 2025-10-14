package v1;

import v0.Alumno;
//import static v0.Alumno.getContador;
//import static v0.Alumno.contador;
import static v0.Alumno.*;

public class Principal {
	public static void main(String[] args) {
		System.out.println(getContador()); //0
        System.out.println(contador);
		Alumno alumno1 = new Alumno("Patrobas",20);
		Alumno alumno2 = new Alumno("Filologo",18);
		Alumno alumno3 = new Alumno("Epeneto",21);
		Alumno alumno4 = new Alumno("Andronico",22);
		System.out.println(getContador()); //4
        System.out.println(contador);
    }
}
