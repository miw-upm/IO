package pruebas;

import upm.jbb.IO;
public class PruebaIOLog {
	public static void main(String[] args) {
		String msj = IO.getIO().readString("Escribe un mensaje");
		IO.getIO().println("Valor del mensaje: " + msj);
		int entero = IO.getIO().readInt("Dame un n�mero entero");
		IO.getIO().println("Valor del entero: " + entero);
		double decimal = IO.getIO().readDouble("Dame un numero decimal");
		IO.getIO().println("Valor del decimal: " + decimal);
		IO.getIO().setStatusBar("Barra de estado");
		System.out.println("Este mensaje sale por la consola...");
	}

}
