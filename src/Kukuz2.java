import java.io.*;

public class Kukuz2 {
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
			if (i == ib) {
				continue;
			}
			
			System.out.print(i + "の段     ");
			
			for(j = 1; j < 10; j++) {
				
				
				
				if (j == ij) {
					continue;
				}
				
				System.out.print("\t");
				System.out.print(j*i);
				}
			
			System.out.println("");
		}
		
	}	
	}	

//以降実行しない段を入力してください > 
//6
//以降実行しない×数を入力してください > 
//6
//1の段     1    2    3    4    5    7    8    9    
//2の段     2    4    6    8    10    14    16    18    
//3の段     3    6    9    12    15    21    24    27    
//4の段     4    8    12    16    20    28    32    36    
//5の段     5    10    15    20    25    35    40    45    
//7の段     7    14    21    28    35    49    56    63    
//8の段     8    16    24    32    40    56    64    72    
//9の段     9    18    27    36    45    63    72    81    


