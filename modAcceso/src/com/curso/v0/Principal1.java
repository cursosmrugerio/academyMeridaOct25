package com.curso.v0;

import com.curso.v1.Cliente;

// menos Permisivo al mas Permisivo
// private -> default* -> protected -> public
// hasta java 8
public class Principal1 extends Cliente {
	
	public static void main(String[] args) {
		Principal1 cliente = new Principal1();
		
		cliente.nombre = "Patrobas";
		
		cliente.setNombre("Andronico");
		
		cliente.getNombre();
	}
	

}
