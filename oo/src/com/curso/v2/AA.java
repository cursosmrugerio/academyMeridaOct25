package com.curso.v2;

class A {
	public int getCode() {
		return 2;
	}
}

class AA extends A {
	public void doStuff() {
	}

	public static void main(String... strings) {
		A a = null;
		AA aa = null;
		
		((AA)a).doStuff();//CORRECTA PERO LANZA NullPointerException
		//aa = a; //INCORRECTA
		aa = (AA)a; //CORRECTA 
		//aa = new A(); //INCORRECTA
		//a = new AA(); //CORRECTA
		//a = (AA)aa; //CORRECTA
		
		
	}
}