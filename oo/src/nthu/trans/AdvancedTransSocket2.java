package nthu.trans;

public class AdvancedTransSocket2 extends TransSocket {

	@Override
	long connect(String str) {
		return 99L; // 1l 1L 1
	}

	public static void main(String[] args) throws ChannelException {
		TransSocket ats = new AdvancedTransSocket2();

		// VARIABLES LOCALES NO SE INICIALIZAN
		long l = 0;

		l = ats.connect("H");

		System.out.println("Program end: " + l);
	}

}
