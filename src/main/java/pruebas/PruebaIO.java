package pruebas;

import upm.jbb.IO;
import upm.jbb.io.Log;
public class PruebaIO {
	public static void main(String[] args) {
		IO.getIO().setLog(Log.DEBUG);
		IO.getIO().setPrintLog(Log.ERROR);
		IO.getIO().println("INFO: ",Log.INFO);
		IO.getIO().println("WARNING" ,Log.WARNING);
		IO.getIO().println("ERROR" ,Log.ERROR);
		IO.getIO().println("Sin especificar");
		IO.getIO().println("DEBUG" ,Log.DEBUG);
		IO.getIO().println("NONE" ,Log.NONE);
	}

}
