package pruebas;

import upm.jbb.IO;

public class PruebaIOs {
	public static void main(String[] args) {
		IO io1,io2,io3;
		io1=IO.getIO("Canal 1");
		io2=IO.getIO("Canal 2");
		io3=IO.getIO("Canal 3");
		io1.println("Prueba...");
		io2.println("Prueba...");
		io3.println("Prueba...");
	}

}
