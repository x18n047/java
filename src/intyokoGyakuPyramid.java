import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class intyokoGyakuPyramid {
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("段数を入力してください < ");
		int dan = Integer.parseInt(br.readLine());
		
		for(int i=0; i<dan; i++){
			for(int e=0; e<dan; e++) {
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
		      for(int f=0; f<i; f++){
			        System.out.print(" ");
			      }
			}
		      System.out.print("\n");
			
		}
		
	}

}

//段数を入力してください < 5
//555555555555555555555555555555555555555555555
// 4444444  4444444  4444444  4444444  4444444 
//  33333    33333    33333    33333    33333  
//   222      222      222      222      222   
//    1        1        1        1        1    
