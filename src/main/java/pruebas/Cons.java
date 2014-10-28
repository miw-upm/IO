package pruebas;

public class Cons {
	private int a;
	private int b;
	private int c;
	public Cons(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Cons(int a, int b) {
		this(a,b,0);
	}
	public Cons(int a) {
		this(a,0,0);
	}
	public Cons() {
		this(0,0,0);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Cons [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
