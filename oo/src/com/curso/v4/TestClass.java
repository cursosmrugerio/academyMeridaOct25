package com.curso.v4;

class Game {
	public void play() throws Exception {
		System.out.println("Playing...");
	}
}

class Soccer extends Game {
	//OVERLOADIG (SOBRECARGA)
	public void play(String ball) {
		System.out.println("Playing Soccer with " + ball);
	}
}

public class TestClass {
	public static void main(String[] args) throws Exception {
		Game g = new Soccer();
		// 1
		((Soccer)g).play("cosco");
		Soccer s = (Soccer) g;
	    // 2
		s.play("cosco");
		
		//g.play("cosco"); at //1 and s.play("cosco"); at //2 //INCORRECTA
		//g.play(); at //1 and s.play(); at //2 //CORRECTA
		//g.play(); at //1 and s.play("cosco"); at //2 //CORRECTA
	}

}
