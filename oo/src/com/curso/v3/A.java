package com.curso.v3;

class A {
	protected int i;

	A(int i) {
		this.i = i;
	}

//	A() {
//	}
}

class B extends A {
	B(){
		super(4);
		System.out.println("i = " + i);
	}
}

//class B extends A {
//	B(){
//		super();
//	}
//}

//class B { B() {} }
//class B {}