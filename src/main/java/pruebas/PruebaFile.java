package pruebas;

import upm.jbb.IO;

public class PruebaFile {

	public static void main(String[] args) {
		IO.getIO().setPath("c:\\");
		IO.getIO().println(IO.getIO().readOpenFile("lectura"));
		IO.getIO().println(IO.getIO().readOpenFile("lectura"));
	}

}
