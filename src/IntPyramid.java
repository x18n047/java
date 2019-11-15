import java.io.*;

public class IntPyramid {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("段数を入力してください < ");
		int dan = Integer.parseInt(br.readLine());
		
		for(int i=1; i<dan+1; i++){
		      for(int j=0; j<dan-(i); j++){
		        System.out.print(" ");
		      }
		      for(int k=0; k<(i)*2-1; k++){
		    	if(i%10!=0) {
		    		System.out.print(i%10);
		    	}else {
		        System.out.print("0");
		    	}
		      }
		      System.out.print("\n");
		    }
		
		
	}
}

//段数を入力してください < 5
//1
//222
//33333
//4444444
//555555555

//段数を入力してください < 20
//1
//222
//33333
//4444444
//555555555
//66666666666
//7777777777777
//888888888888888
//99999999999999999
//0000000000000000000
//111111111111111111111
//22222222222222222222222
//3333333333333333333333333
//444444444444444444444444444
//55555555555555555555555555555
//6666666666666666666666666666666
//777777777777777777777777777777777
//88888888888888888888888888888888888
//9999999999999999999999999999999999999
//000000000000000000000000000000000000000


