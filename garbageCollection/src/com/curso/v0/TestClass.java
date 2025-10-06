package com.curso.v0;

class Node {
	//VARIABLE DE INSTANCIA DE TU MISMO TIPO
	Node next; //null

	public Node() {
		next = null;
	}

	public Node(Node next) {
		this.next = next;
	}

	public String dump() {
		return "from dump";
	}
}

class TestClass {
	
	public static void main(String[] args) {
		Node n1 = new Node(); //CONSTRUCTOR VACIO
		Node n2 = new Node(n1);
		
		System.out.println(n1.next); //null
		System.out.println(n1 == n2.next); //true
		
		Node n3 = new Node();
		
		n1 = null;
		
		
		
	}
}
