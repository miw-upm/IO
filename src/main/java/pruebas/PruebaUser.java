package pruebas;

import upm.jbb.IO;

public class PruebaUser {

	public static void main(String[] args) {
		//IO.out.println(IO.in.read("pruebas.User2", "Prueba User"));
		User2 u2 = new User2();
		u2.setB(true);
		IO.out.println(IO.in.read(u2, "Prueba User"));
	}

}
