package pruebas;

import upm.jbb.IO;

public class PruebaSelect {

	public static void main(String[] args) {
		//String[] seleccion ={"uno","dos","tres"};
		//User[] seleccion = new User[3];
		//seleccion[0]= new User(1,1,1);
		//seleccion[1]= new User(2,2,2);
		//seleccion[2]= new User(3,3,3);
		//Boolean[] seleccion = {true,false};
		Integer[] seleccion ={1,2,3,4,5};
		Object obj=IO.getIO().select(seleccion, "Select");
		IO.getIO().println(obj);
		Object obj2=IO.getIO().select(10, "Select");
		IO.getIO().println(obj2);
		Object obj3=IO.getIO().select(18,30, "Select");
		IO.getIO().println(obj3);
	}

}
