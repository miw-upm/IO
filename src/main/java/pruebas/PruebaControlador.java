package pruebas;

import upm.jbb.IO;

public class PruebaControlador {

	public static void main(String[] args) {
		IO.getIO().addView(new Contro2());
        IO.getIO().addView(new Controlador(),true);
        IO.getIO().addView(new Controlador(),true);
	}

}
