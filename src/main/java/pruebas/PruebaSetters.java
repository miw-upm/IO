package pruebas;

import upm.jbb.IO;

public class PruebaSetters {
	public static void main(String[] args) {
		Usr u= new Usr();
		IO.out.setters(u);
		IO.out.println(u);
	}

}
