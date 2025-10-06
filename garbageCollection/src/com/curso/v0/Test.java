package com.curso.v0;

public class Test {
	void test() {
		MyClass obj = new MyClass();
		obj.name = "jack"; 
		// 1 insert code here
		obj = null;
		
//      //NO SE PUEDE EN EL MUNDO PRIMITIVO		
//		int x = 5;
//		x = null;
		
	}
} 

// In MyClass.java
class MyClass {
	int value;
	String name;
}
