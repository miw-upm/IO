package pruebas;

import upm.jbb.IO;

public class PruebaNumber {
	public static void main(String[] args) {
		IO.getIO().println(IO.getIO().read("Float","Number"));
		IO.getIO().println(IO.getIO().read("Double","Number"));
		IO.getIO().println(IO.getIO().read("Byte","Byte"));
		IO.getIO().println(IO.getIO().read("Short","Number"));
		IO.getIO().println(IO.getIO().read("Integer","Number"));
		IO.getIO().println(IO.getIO().read("Long","Number"));
	}

}
