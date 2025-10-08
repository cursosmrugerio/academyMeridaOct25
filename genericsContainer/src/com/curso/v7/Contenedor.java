package com.curso.v7;

public class Contenedor<T extends Fruta> {
	
	private T t;

	public Contenedor(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public <Z> void showCodigo(Z z) {
		System.out.println(t.getClass().getSimpleName());
		System.out.println("Código: "+z);
	}
	
}
