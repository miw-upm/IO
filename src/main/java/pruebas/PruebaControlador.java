package pruebas;

import upm.jbb.IO;

public class PruebaControlador {

	public static void main(String[] args) {
		IO.in.addController(new Contro2());
		IO.in.addController(new Controlador(),false);
	}

}
