package pruebas;

import upm.jbb.IO;
public class DemoIO {
	
	public static void main(String[] args) {
		String[] s = {"uno", "dos", "tres"};
		
		IO.getIO().print(3);
		IO.getIO().println();
		IO.getIO().println(s);
		IO.getIO().println(new Usr("Usuario",(byte)3));
		
		IO.getIO().println(IO.getIO().readString());
		IO.getIO().println(IO.getIO().readString("Dame una cadena"));
		IO.getIO().println(IO.getIO().readInt());
		IO.getIO().println(IO.getIO().readInt("Edad"));
		IO.getIO().println(IO.getIO().readDouble("valor"));
		
		IO.getIO().println(IO.getIO().read("byte","Un byte..."));
		IO.getIO().println(IO.getIO().read("boolean","Un boolean..."));
		IO.getIO().println(IO.getIO().read("Short","Un Short..."));
		IO.getIO().println(IO.getIO().read("Integer[]","Un array de Integer..."));
		IO.getIO().println(IO.getIO().read("java.util.List<Integer>","Una List de Integer..."));
		IO.getIO().println(IO.getIO().read("pruebas.Usr","Un Usr..."));
		
		IO.getIO().println(IO.getIO().select(10));
		IO.getIO().println(IO.getIO().select(10,"Edad"));
		IO.getIO().println(IO.getIO().select(18,65,"Edad"));
		IO.getIO().println(IO.getIO().select(s));
		IO.getIO().println(IO.getIO().select(s,"Elige..."));
		
		String[] clases={"Byte","String","String[]","pruebas.Usr"};
		String[] msgs={"Edad","Nombre","Array","Usuario"};
		IO.getIO().println(IO.getIO().readForm(clases,msgs));
		
		
		IO.getIO().addView(new Controlador());
		IO.getIO().addView(new Controlador());	
		
		IO.getIO().setStatusBar("Demo");
		System.out.println("consola...");
		//IO.getIO().clear();
		
		IO.getIO().addViewPanel(new Usr());
		IO.getIO().addViewPanel(new Usr());
	}
}
