package pruebas;

import upm.jbb.IO;

public class PruebaSetters {
	public static void main(String[] args) {
		Usr u= new Usr();
		IO.getIO().setters(u);
		IO.getIO().println(u);
	}

}
