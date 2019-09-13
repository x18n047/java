
public class Rei8_3_1w {
	public static void main(String args[]) {
		int total;
		int a1 = 15, a2 = 10;
		
		System.out.println("a1 = 15");
		System.out.println("a2 = 10");
		
		Calc cl = new Calc();
		total = cl.hiku(a1, a2);
		
		System.out.println("引き算 15 - 10 = " + total);
	}
}


class Calc{
	public int hiku(int b1, int b2) {
		int total;
		
		total = b1 - b2;
		
		return total;
	}
}
