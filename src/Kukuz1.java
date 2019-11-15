import java.io.*;


public class Kukuz1 {
	public static void main(String args[])throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ib;
		int ij;
		System.out.println("以降実行しない段を入力してください > ");
		ib = Integer.parseInt(br.readLine());
		System.out.println("以降実行しない×数を入力してください > ");
		ij = Integer.parseInt(br.readLine());
		
		
		int i = 1;
		int j = 1;
		for(i = 1; i < 10; i++) {
			
			if (i == ij) {
				break;
				}
			
			System.out.print(i + "の段     ");
			
			for(j = 1; j < 10; j++) {
				
				if (j == ij) {
					break;
					}
				
				System.out.print(j*i);
				System.out.print("    ");
				
				}
			System.out.println("");
			
		}		
	}
}

//実行結果
//以降実行しない段を入力してください > 
//6
//以降実行しない×数を入力してください > 
//6
//1の段     1    2    3    4    5    
//2の段     2    4    6    8    10    
//3の段     3    6    9    12    15    
//4の段     4    8    12    16    20    
//5の段     5    10    15    20    25    

