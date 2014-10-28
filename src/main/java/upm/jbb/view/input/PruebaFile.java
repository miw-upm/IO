package upm.jbb.view.input;

import upm.jbb.IO;

public class PruebaFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] exts={"pdf"};
		IO.out.println(IO.in.readOpenFile("doc",exts));
		IO.out.println(IO.in.readSaveFile());
	}

}
