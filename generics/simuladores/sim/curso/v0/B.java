package sim.curso.v0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class A {
	public List<? extends Number> getList() {
		return null;
	}
}

public class B extends A {
	@Override

	public ArrayList<Number> getList() {
		return null;
	}
//	public LinkedList<? extends Number> getList() {
//		return null;
//	}	

//	public List<Integer> getList() { //Double, 
//		return null;
//	}
//	public List<? extends Integer> getList() {
//		return null;
//	}
//	public List<? extends Number> getList() {
//		return null;
//	}
}
