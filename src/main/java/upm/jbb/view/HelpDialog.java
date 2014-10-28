package upm.jbb.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HelpDialog extends JDialog implements WindowListener,
		ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton btnAceptar;

	public HelpDialog(IOFrame owner, String version) {
		super(owner, "Help Content", ModalityType.APPLICATION_MODAL);
		String ayuda = "";
		ayuda += "--Para escribir un texto: IO.out.print(...) o IO.out.println(...), acepta todos los tipos \n";
		ayuda += "--Las escrituras del tipo: System.out.print(...), se sacan por la consola de la clase IO\n";
		ayuda += "--Para escribir un texto con nivel de LOG: IO.out.print(..., Log.INFO) o IO.out.println(...,Log.ERROR) \n";
		ayuda += "     Sólo se imprime si el nivel especificado es inferior o igual al actual. Por defecto, son Log.INFO \n";
		ayuda += "     Para cambiar el nivel de LOG actual: IO.out.setLog(Log.WARNING): Log.DEBUG, Log.ERROR, Log.WARNING, Log.INFO \n";
		ayuda += "--Para borrar la salida: IO.out.clear() \n";
		ayuda += "--Para leer: IO.in.read(\"Clase\",\"mensaje\") � IO.in.read(MiClase.class,\"mensaje\") � IO.in.read(Wrapper,\"mensaje\")\n";
		ayuda += "     Acepta cualquier nombre de Clase, incluido primitivos, colecciones, arrays, enumerados...\n";
		ayuda += "     No soporta ni arrays multiples, ni combinaciones de coleciones y arrays juntos en un mismo tipo\n";
		ayuda += "     Se deben poner los nombres de paquetes, ej. java.util.Set<String>, mio.Clase (java.lang es opcional)\n";
		ayuda += "     Si se cancela la lectura, devuelve el valor por defecto\n";
		ayuda += "     Ejemplos: IO.in.read(\"String[]\",\"\"); IO.in.read(\"uno.Clase\",\"\"); IO.in.read(\"java.util.Set<<List<String>>\",\"\"); \n";
		ayuda += "     Ejemplos: IO.in.read(Clase.class,\"Un clase cualquiera\"); IO.in.read(Clase[].class,\"Un array\"); IO.in.read(java.awt.Color.RED,\"Color\"); IO.in.read(5,\"Valor\"); \n";
		ayuda += "--Para modificar un objeto: IO.in.setters(objeto,\"mensaje\") o IO.in.setters(objeto)\n";
		ayuda += "--Para leer un String: IO.in.readString(\"mensaje\") o IO.in.readString()\n";
		ayuda += "     Equivalente a IO.in.read(\"String\",\"mensaje\")\n";
		ayuda += "--Para leer un Color: IO.in.read(\"java.awt.Color\",\"mensaje\") o IO.in.read(\"java.awt.Color\")\n";
		ayuda += "--Para leer un fichero: IO.in.readOpenFile(\"mensaje\",String[] extensiones) o IO.in.readOpenFile(\"mensaje\") o IO.in.readOpenFile()\n";
		ayuda += "     Equivalente a IO.in.read(\"java.io.File\",\"Open mensaje\")\n";
		ayuda += "--Para escribir un fichero: IO.in.readSaveFile(\"mensaje\",String[] extensiones) o IO.in.readSaveFile(\"mensaje\") o IO.in.readSaveFile()\n";
		ayuda += "     Equivalente a IO.in.read(\"java.io.File\",\"Save mensaje\")\n";
		ayuda += "--Se puede establecer el path: IO.in.setPath(String path)\n";
		ayuda += "--Para leer un Formulario de campos (array de String con los tipos, array de class o array de objetos) \n";
		ayuda += "     Ejemplos: String[] msgs={\"Nombre\",\"Edad\",\"Clase\"}; \n";
		ayuda += "     Ejemplos: String[] campos={\"String\",\"Integer\",\"mio.Clase\"}; IO.in.readForm(campos, msgs) \n";
		ayuda += "     Ejemplos: Class<?>[] campos={String.class,Integer.class,mio.Clase.class}; IO.in.readForm(campos) \n";
		ayuda += "     Ejemplos: Object[] campos={\"Ini\",23,new mio.Clase()}; IO.in.readForm(campos,msgs) \n";
		ayuda += "--Para leer un int: IO.in.readInt(\"mensaje\") o IO.in.readInt() \n";
		ayuda += "     Equivalente a IO.in.read(\"int\",\"mensaje\")\n";
		ayuda += "--Para leer un double: IO.in.readDouble(\"mensaje\") o IO.in.readDouble() \n";
		ayuda += "     Equivalente a IO.in.read(\"double\",\"mensaje\")\n";
		ayuda += "--Para elegir un objeto de una lista: IO.in.select(array[],\"mensaje\") o IO.in.select(array[]) \n";
		ayuda += "     Para leer un valor entero entre 0 y un m�ximo:IO.in.select(max,\"mensaje\")\n";
		ayuda += "     Para leer un valor entero entre un m�nimo y un m�ximo:IO.in.select(min,max,\"mensaje\")\n";
		ayuda += "--Para escribir en la barra de estado: IO.out.setStatusBar(\"mensaje\")\n\r";
		ayuda += "--Para crear acciones: \n\r";
		ayuda += "     Crear una clase que realiza la funci�n de controlador\n\r";
		ayuda += "     Añadir métodos de tipo void y sin parámetros: public void miAccion(){...}\n\r";
		ayuda += "     Llamar al m�todo: IO.in.addController(Object Controlador) o IO.in.addController(Object Controlador, boolean viewButton);\n\r";
		ayuda += "     Tambien se permite realizar desde el menu Class\n\r";
		ayuda += "--Para a�adir un modelo: \n\r";
		ayuda += "     Crear una clase que realiza la funci�n de modelo\n\r";
		ayuda += "     Llamar al método: IO.in.addModel(Object Modelo);\n\r";
		ayuda += "     Se permite el manejo de varios modelos\n\r";
		ayuda += "     Tambien se puede realizar desde el menu Class\n\r";
		ayuda += "--Se permiten varias instancias: IO io = new IO(String titulo); io.read(), io.println(), io.setStatusBar()...\n\r";

		this.getContentPane().setLayout(new BorderLayout());
		JPanel sur = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
		this.btnAceptar = new JButton("Aceptar");
		this.btnAceptar.addActionListener(this);
		sur.add(new JLabel(version+"     "));
		sur.add(this.btnAceptar);
		JTextArea txtAyuda = new JTextArea(ayuda, 25, 80);
		txtAyuda.setEditable(false);
		JScrollPane txtScroll = new JScrollPane(txtAyuda);
		this.getContentPane().add(txtScroll, BorderLayout.CENTER);
		this.getContentPane().add(sur, BorderLayout.SOUTH);
		this.addWindowListener(this);
		this.setLocation(owner.newLocationDialog());
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		this.windowClosing(null);

	}

	@Override
	public void windowClosing(WindowEvent event) {
		this.setVisible(false);
		this.dispose();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		this.pack();
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		this.pack();
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		this.pack();
	}

}
