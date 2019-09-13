import java.io.*;

public class Total02x {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int from;
		System.out.print("fromの値を入力してください >" );
		from = Integer.parseInt(br.readLine());
		
		int to;
		System.out.print("toの値を入力してください >" );
		to = Integer.parseInt(br.readLine());
		
		int i = from;
		int sum = 0;
		
		while(i <= to) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("総和は" + sum + "です。");
	}
}

//fromの値を入力してください >1
//toの値を入力してください >10
//総和は55です。
