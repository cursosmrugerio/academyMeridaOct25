package com.curso.v2;

class M {
	Object obj = null;

	public M(String val) {
		obj = val;
	}
}

class N {
	private M m = new M("hello");

	public static void main(String[] args) {
		N n = new N();
		n = null;
		//System.gc();
		System.out.println(n.m.obj); 
	}
}
