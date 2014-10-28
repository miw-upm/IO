package pruebas;

import upm.jbb.IO;

public class Controlador {
	
	public void Acc1 (){
		IO.getIO().println("Acc1...");
		IO.getIO().setEnabledButton("Acc5", false);
	}
	public void Acc2 (){
		IO.getIO().println("Acc2...");
        IO.getIO().setEnabledButton("Acc5", true);
	}
	public void Acc3 (){
		IO.getIO().println("Acc3...");
	}
	public void Acc4 (){
		IO.getIO().println("Acc4...");
	}
	public void Acc5 (){
		IO.getIO().println("Acc5...");
		int i=3/0;
		IO.getIO().println(i);
	}

}
