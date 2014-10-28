package pruebas;

import upm.jbb.IO;
public class PruebaIOLog {
	public static void main(String[] args) {
		String msj = IO.in.readString("Escribe un mensaje");
		IO.out.println("Valor del mensaje: " + msj);
		int entero = IO.in.readInt("Dame un número entero");
		IO.out.println("Valor del entero: " + entero);
		double decimal = IO.in.readDouble("Dame un numero decimal");
		IO.out.println("Valor del decimal: " + decimal);
		IO.out.setStatusBar("Barra de estado");
		System.out.println("Este mensaje sale por la consola...");
	}

}
