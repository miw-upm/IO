package pruebas;

import upm.jbb.IO;
public class DemoIO {
	
	public static void main(String[] args) {
		String[] s = {"uno", "dos", "tres"};
		
		IO.out.print(3);
		IO.out.println();
		IO.out.println(s);
		IO.out.println(new Usr("Usuario",(byte)3));
		
		IO.out.println(IO.in.readString());
		IO.out.println(IO.in.readString("Dame una cadena"));
		IO.out.println(IO.in.readInt());
		IO.out.println(IO.in.readInt("Edad"));
		IO.out.println(IO.in.readDouble("valor"));
		
		IO.out.println(IO.in.read("byte","Un byte..."));
		IO.out.println(IO.in.read("boolean","Un boolean..."));
		IO.out.println(IO.in.read("Short","Un Short..."));
		IO.out.println(IO.in.read("Integer[]","Un array de Integer..."));
		IO.out.println(IO.in.read("java.util.List<Integer>","Una List de Integer..."));
		IO.out.println(IO.in.read("pruebas.Usr","Un Usr..."));
		
		IO.out.println(IO.in.select(10));
		IO.out.println(IO.in.select(10,"Edad"));
		IO.out.println(IO.in.select(18,65,"Edad"));
		IO.out.println(IO.in.select(s));
		IO.out.println(IO.in.select(s,"Elige..."));
		
		String[] clases={"Byte","String","String[]","pruebas.Usr"};
		String[] msgs={"Edad","Nombre","Array","Usuario"};
		IO.out.println(IO.in.readForm(clases,msgs));
		
		
		IO.in.addController(new Controlador());
		IO.in.addController(new Controlador());	
		
		IO.out.setStatusBar("Demo");
		System.out.println("consola...");
		//IO.out.clear();
		
		IO.in.addModel(new Usr());
		IO.in.addModel(new Usr());
	}
}
