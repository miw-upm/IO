package pruebas;

import upm.jbb.IO;

public class PruebareadForm {
	public static void main(String[] args) {
		//String[] c= {"java.awt.Color","int", "pruebas.User", "String", "double"};
		//Class<?>[] c= {java.awt.Color.class,Integer.class,User.class,String.class,Double.class};
		Object[] c= {java.awt.Color.RED,3,new User(),"ini",3.4};
		String[] s= {"Color","Edad", "Valor", "Nombre", "Valor"};
		Object[] v= IO.getIO().readForm(c,s);
		IO.getIO().println(v);
	}

}
