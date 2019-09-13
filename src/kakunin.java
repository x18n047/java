
public class kakunin {
	
	public static void main(String args[]) {
	
		System.out.println("msg: do_whileを利用して1から55までの整数を表示する。");
		System.out.println("mag: 5の倍数を表示したら改行する");
		
		int i = 0;
		do {
			i++;
			System.out.print(i + "   ");
			if(i%5==0) {
				System.out.println();
			}
				
		}while(i < 55);
		
	}
}
