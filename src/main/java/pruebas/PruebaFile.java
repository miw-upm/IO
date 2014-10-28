package pruebas;

import upm.jbb.IO;

public class PruebaFile {

	public static void main(String[] args) {
		IO.in.setPath("c:\\");
		IO.out.println(IO.in.readOpenFile("lectura"));
		IO.out.println(IO.in.readOpenFile("lectura"));
	}

}
