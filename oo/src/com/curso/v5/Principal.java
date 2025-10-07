package com.curso.v5;

class A{
	public Object myMethod() {
		return null;
	}
}

class B extends A{
	@Override //COVARIANZA
	public Principal myMethod() {
		return null;
	}
}

public class Principal {

}
