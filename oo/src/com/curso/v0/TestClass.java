package com.curso.v0;

public class TestClass {

	public static void main(String[] args) {
		int res = 0;
		
		Object c = new C();
		System.out.println(((C)c).max(10, 20)); //80
		
		//IZQUIERDO clase o superclase //VARIABLE DE REFERENCIA
		//DERECHO   clase o subclase   //OBJETO
		//b a = new A(); 
		//System.out.println(a.max(1, 2));

		
//		B b = new B();
//		res = b.max(1, 2);
		
//		C c = new C();
//		res = c.max(1, 2);
//		System.out.println("Resultado: " + res); //8
	}

}

class A {
	//          20,     40
	int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}
}

class B extends A {
	@Override
	//          20,     40
	int max(int x, int y) {
		           //40
		return 2 * super.max(x, y);
	}
}

class C extends B {
	@Override
	//          10,     20
	int max(int x, int y) {
		       //80
		return super.max(2 * x, 2 * y);
	}
}
