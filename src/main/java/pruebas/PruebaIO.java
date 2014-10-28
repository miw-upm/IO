package pruebas;

import upm.jbb.IO;
import upm.jbb.io.Log;
public class PruebaIO {
	public static void main(String[] args) {
		IO.out.setLog(Log.DEBUG);
		IO.out.setPrintLog(Log.ERROR);
		IO.out.println("INFO: ",Log.INFO);
		IO.out.println("WARNING" ,Log.WARNING);
		IO.out.println("ERROR" ,Log.ERROR);
		IO.out.println("Sin especificar");
		IO.out.println("DEBUG" ,Log.DEBUG);
		IO.out.println("NONE" ,Log.NONE);
	}

}
