package pruebas;

import upm.jbb.IO;

public class PruebaControlador {

	public static void main(String[] args) {
		IO.getIO().addview(new Contro2());
		IO.getIO().addView(new Controlador(),false);
	}

}
