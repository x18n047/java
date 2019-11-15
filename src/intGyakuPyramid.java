import java.io.*;

public class intGyakuPyramid {
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("段数を入力してください < ");
		int dan = Integer.parseInt(br.readLine());
		
		for(int i=0; i<dan; i++){
		      for(int j=0; j<i; j++){
		        System.out.print(" ");
		      }
		      for(int k=0; k<(dan-i)*2-1; k++){
		    	if((dan-i)%10!=0) {
		    		System.out.print((dan-i)%10);
		    	}else {
		        System.out.print("0");
		    	}
		      }
		      System.out.print("\n");
		
		}
		
	}

}

//段数を入力してください < 5
//555555555
// 4444444
//  33333
//   222
//    1

//段数を入力してください < 12
//22222222222222222222222
// 111111111111111111111
//  0000000000000000000
//   99999999999999999
//    888888888888888
//     7777777777777
//      66666666666
//       555555555
//        4444444
//         33333
//          222
//           1




