
public class Kuku_break {
	public static void main(String args[]) {
		System.out.println("6の段以降を表示しない");
		int i = 1;
		int j = 1;
		for(i = 1; i < 10; i++) {
			System.out.print(i + "の段     ");
			
			for(j = 1; j < 10; j++) {
				
				System.out.print(j*i);
				System.out.print("    ");
				if (j >=6) {
				break;
				}
				}
			System.out.println("");
		}		
	}
}
