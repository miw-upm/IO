package pruebas;

import upm.jbb.IO;

public class Controlador {
	
	public void Acc1 (){
		IO.out.println("Acc1...");
	}
	public void Acc2 (){
		IO.out.println("Acc2...");
	}
	public void Acc3 (){
		IO.out.println("Acc3...");
	}
	public void Acc4 (){
		IO.out.println("Acc4...");
	}
	public void Acc5 (){
		IO.out.println("Acc5...");
		int i=3/0;
		IO.out.println(i);
	}

}
