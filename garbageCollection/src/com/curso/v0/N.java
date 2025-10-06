package com.curso.v0;

class M {
}

class N {
	//VARIABLE DE INSTANCIA PRIVADA
	//HAS-A (TIENE UN)
	private M m = new M();

	public void makeItNull(M pM) {
		pM = null;
	}

	public void makeThisNull() {
		makeItNull(m);
	}

	public static void main(String[] args) {
		N n = new N();
		n.makeThisNull();
		
		//n.m = null;
		
		System.out.println(n.m);
		
		System.out.println(n.m != null); //true
		
	}
}
