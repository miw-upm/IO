package pruebas;

import upm.jbb.IO;

public class PruebaByte {

	public static void main(String[] args) {
	   IO io = IO.getIO("uno");
	   io.readInt("edad");
	   io.println("ddd");
		//IO.out.println(IO.in.read("Byte","Byte"));
	//	IO.out.println(IO.in.read("byte","byte"));
		//IO.out.println(IO.in.read(Byte.class,"Byte"));
		//IO.out.println(IO.in.read(List.class,"Byte"));
		//IO.out.println(IO.in.read(new Byte((byte) 3),"Byte con valor inicial"));
	}

}
