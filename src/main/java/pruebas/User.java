package pruebas;

public class User {

	private int i,j;
	private User user;


	public User(int i,int j) {
		this.i = i;
		this.j=j;
	}


	public User() {
	}


	public int getI() {
		return i;
	}


	public int getJ() {
		return j;
	}


	public void setJ(int j) {
		this.j = j;
	}


	public void setI(int i) {
		if (i<0) throw new RuntimeException("kk");
		this.i = i;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public void set(int i, int j){
		this.i=i;
		this.j=j;
	}

	@Override
	public String toString() {
		return "user("+i+","+user+")";
	}

}
