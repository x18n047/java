import java.io.*;

public class Execalc {
	public static void main(String args[]) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("あなたのお名前は？ > " );
		String name  = br.readLine();
		System.out.println(name+"さん、これから割り算を行います。数値を２つ入力してください。");
		//System.out.println(name);
		System.out.print("割られる数は？ >  ");
		int kazu1 = Integer.parseInt(br.readLine());
		System.out.print("割る数は？ > ");
		int kazu2 = Integer.parseInt(br.readLine());
		//System.out.println(kazu2);
		System.out.println("計算結果は"+kazu1+"÷"+kazu2+"="+kazu1/kazu2+"余り"+kazu1%kazu2+"です");
		
		}
}
