import java.io.*;

public class Uranaix {
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("あなたの名前を入力してください>");
		String name = br.readLine();
		System.out.print("本日の"+name+"さんは");		
		
		
		int hitnumber = (int)(Math.random() * 100);
		if (hitnumber < 20) {
			System.out.println("何をやっても絶好調です。");
		}
			else if (hitnumber < 30) {
				System.out.println("待ちわびた人に出会えます。");
			}else if (hitnumber < 80) {
				System.out.println("7がラッキーナンバーです。");
			}else {
				System.out.println("風邪をひきやすいので注意しましょう");
			}
		System.out.println("hitnumber = " + hitnumber);
	}

}
