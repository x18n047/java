
public class Kuku_continue {
	public static void main(String args[]) {
		System.out.println("6の段を表示しない");
		int i = 1;
		int j = 1;
		for(i = 1; i < 10; i++) {
			if (i ==6) {
				continue;
			}
			System.out.print(i + "の段     ");
			
			for(j = 1; j < 10; j++) {
				
				System.out.print(j*i);
				System.out.print("    ");
				}
			
			System.out.println("");
		}
		
		}		
}

