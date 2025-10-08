package com.curso.v11;

class Ave {
	void volarAve() {
		System.out.println("Volar Ave");
	}
}

class Pato extends Ave {
	void volarPato() {
		System.out.println("Volar Pato");
	}
}

class PatoSilvestre extends Pato {
	void volarPatoSilvestre() {
		System.out.println("Volar Pato Silvestre");
	}
}

class PatoGoma extends Pato {
	void volarPatoGoma() {
		System.out.println("Volar Pato Goma");
	}
}

public class Principal {

	public static void main(String... strings) {
		PatoGoma patoGoma = new PatoGoma(); // 1 OBJECT
		// UPCASTING (CAST HACIA ARRIBA)
		Pato pato = patoGoma;
		Ave ave = pato;
		Object obj = ave;
//		Pato pato = (Pato)patoGoma;
//		Ave ave = (Ave)pato;
//		Object obj = (Object)ave;

		// DOWNCASTING (CAST HACIA ABAJO)
		Ave ave2 = (Ave) obj;
		Pato pato2 = (Pato) ave2;

		if (pato2 instanceof PatoSilvestre) {
			PatoSilvestre patoSil = (PatoSilvestre) pato2;
			patoSil.volarPatoSilvestre(); // ClassCastException
		}
		
		if (pato2 instanceof PatoGoma) {
			PatoGoma patoSil = (PatoGoma) pato2;
			patoSil.volarPatoGoma(); 
		}
	}

}
