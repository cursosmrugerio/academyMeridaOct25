package com.curso.v0;

public class Principal1 {

	public static void main(String[] args) {
		int x = 8;
		int y = 0;
		
		int res=0;
		
		try {
			res = dividir(x,y);
			System.out.println("Resultado: "+res );
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("End Program");
	}
	
	static int dividir(int x,int y) throws DividirCeroException {
		
		if (y==0)
			throw new DividirCeroException("No se puede dividir entre cero");
		
		return x/y;
	}

}
