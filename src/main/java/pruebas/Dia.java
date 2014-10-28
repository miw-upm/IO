package pruebas;

import upm.jbb.IO;

public class Dia {
	private int dia;

	public Dia(int dia) {
		if (dia<0) throw new IllegalArgumentException("kkk ckkkck kkckckckck kck ck kckck ");
		this.dia = dia;
	}

	public int getDia() {
		return dia;
	}
	
	public static void main (String[] args){
		IO.getIO().read("pruebas.Dia","dia");
	}
}
