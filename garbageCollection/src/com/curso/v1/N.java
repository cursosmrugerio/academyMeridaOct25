package com.curso.v1;


class M {
	static Object obj = null;

	public M(String val) {
		obj = val;
	}
}

class N {
	private M m = new M("hello");

	public static void main(String[] args) {
		N n = new N();
		n = null;
		System.gc();
		System.out.println(M.obj); //Hello
	}
}
