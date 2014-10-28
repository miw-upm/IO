package pruebas;

import upm.jbb.IO;

public class PruebaArray {

	public static void main(String[] args) {
		//Tabla t = new Tabla();
		//IO.in.readObject(t);
		int[] a=(int[]) IO.getIO().read("int[]", "Prueba array");
		IO.getIO().println(a);
		//IO.out.println(IO.in.read("pruebas.User[]", "Prueba array"));
	}

}
