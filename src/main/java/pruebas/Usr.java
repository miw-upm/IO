package pruebas;

import java.util.List;

public class Usr {
	private String s;
	private byte b;
	private List<Usr> l;
	private Usr[] us;

	public Usr() {
		this("", (byte) 0);
	}

	public Usr(String s) {
		this(s, (byte) 0);
	}

	public Usr(String s, byte b) {
		this.setS(s);
		this.setB(b);
	}

	public String getS() {
		return this.s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public byte getB() {
		return this.b;
	}

	public void setB(byte b) {
		this.b = b;
	}

	public List<Usr> getL() {
		return this.l;
	}

	public void setL(List<Usr> l) {
		this.l = l;
	}

	public Usr[] getUs() {
		return this.us;
	}

	public void setUs(Usr[] us) {
		this.us = us;
	}

	@Override
	public String toString() {
		return "Usr[b=" + b + ", l=" + l + ", s=" + s + "]";
	}

}
