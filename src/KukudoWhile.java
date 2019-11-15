
public class KukudoWhile {
		public static void main(String[] args) {
			
			
			System.out.println("msg: do_while文を使って九九表を作成します。");
			
			int i = 1;
			int j = 1;
			
			do {
				System.out.print(i + "の段　");
				do {
					System.out.print(i * j + " ");  
					j++; 
				}while(j<=9);
				
				j = 1;
			    System.out.println("");
				 
				i++;
				
			}while (i <= 9);
			
				
		}

}
