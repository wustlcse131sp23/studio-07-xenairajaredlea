package studio7;

public class Die {
	
	private int n;
	
	public Die(int initn) {
		n = initn;
	}
	
	public int getn() {
		return n;
	}
	
	public void setn(int newn) {
		n = newn;
	}
	
	public int rolledNum() {
		return (int)(Math.random()*n)+1;
	}

	public static void main(String[] args) {
		Die n1 = new Die(5);
		System.out.println(n1.rolledNum());

	}

}
