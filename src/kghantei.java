import java.io.*;

public class kghantei {
	public static void main(String[] args)throws IOException {
		String kisuu = "奇数計： sum(";
		String guusu = "偶数計： sum(";
		
		int kisuu_sum = 0;
		int guusu_sum = 0;
		
		System.out.println("msg: 入力した値が奇数か偶数かを判定してそれぞれの足し算を行います。");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("msg: input 整数(終了：99) > " );
		
		int seisu = Integer.parseInt(br.readLine());
		
		for( ; seisu != 99; ) {
			
			
			int amari = seisu - (seisu / 2 * 2);
			if( amari == 0) {
				//System.out.println(seisu + "は偶数です。");
				guusu += seisu + ",";
				guusu_sum += seisu;
			}else{
				//System.out.println(seisu + "は奇数です。");
				kisuu += seisu + ",";
				kisuu_sum += seisu;
			}
			System.out.print("msg: input 整数(終了：99) > " );
			seisu = Integer.parseInt(br.readLine());
			
		}
		System.out.println(kisuu + ") = " + kisuu_sum);
		System.out.println(guusu + ") = " + guusu_sum);
	}

}
