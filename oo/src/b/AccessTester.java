package b;

import a.AccessTest;

public class AccessTester extends AccessTest {

	public static void main(String[] args) {
		AccessTest ref = new AccessTest();
		//ref.c(); //NO
		ref.d();
		//ref.a; //NO
		
		AccessTester ref2 = new AccessTester();
		ref2.d();
		ref2.c(); //SI
	}
}
