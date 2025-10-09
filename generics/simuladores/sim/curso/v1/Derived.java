package sim.curso.v1;

import java.util.*;

class Base{   
	public ArrayList<Number> transform(
								Set<Integer> list){
		return null;      
	}
}  

class Derived extends Base{   
	
	@Override
	public ArrayList transform(Set list){
		return null; 
	}  


	public static void main(String... args){
		System.out.println("Hello Derived 3");
	}  
}  