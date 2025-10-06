package com.curso.v1;

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
		
		n3.next = n2;
		
		n1 = null;
		n2 = null;
		
		Node n4 = n3.next.next;
		
		n4.next = n3;
		
		System.out.println(n3 == n3.next.next.next.next.next.next); //true
		System.out.println(n4.next == n3.next.next.next.next.next.next); //true
		
		
	}
}
