import java.io.*;

public class Kaizyo {
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kaizyo;
		System.out.print("整数値を入力してください >" );
		kaizyo = Integer.parseInt(br.readLine());
		
		int kekka = 1;
		int i;
		
		for(i=1;i<=kaizyo;i++) {
			kekka *= i;
		}
		System.out.println(kaizyo + "! = " + kekka);
	}
}

//整数値を入力してください >4
//4! = 24
