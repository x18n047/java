import java.io.*;

public class nikonikofu {
	public static void main(String args[]) throws IOException{
		String[] msg = {"88888888", 
				"gdgd",
				"神降臨曲",
				"きたよ",	
				"おおおおおお",
				"きゃ～～",
				"この曲、大好き",
				"ミウ～",
				"かわい～な",
				"ああああああああ",
				"ミウ、ありがと～",
				"大人～",
				"お姫様～",
				"キタアア～",
				"愛してる～",
				"いいね！"};
		
		System.out.println("msg:初音ミウのコンサートが始まります。");
		System.out.print("msg: Hit EnterKey");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String start = br.readLine();
		
		boolean flag = false;
		for ( ; flag == false; ) {
			for ( int hyouji_gyo = 1; hyouji_gyo <= 10; hyouji_gyo++) {
				//1行のメッセージ数を乱数にて決める
				int  ran_msgsu = (int)(Math.random() * 5 );
				for (int i = 0; i < ran_msgsu; i++) {
				
				//1メッセージの前の空白を乱数にて決める
				int ran_space = (int)(Math.random() * 15);
				
				for (int j = 0; j < ran_space; j++) {
					System.out.print(" ");
				}
	
				
				//メッセージの内容を乱数にて決める
				int ran_msg = (int)(Math.random() * msg.length);
				System.out.print(msg[ran_msg]);
				}
				System.out.println();
			}
			System.out.print("msg:続ける:Hit EnterKey  止める:SpaceKey+EnterKey");
			start = br.readLine();
			if( start.equals(" ")){
				flag = true;
			};
		}
	}
}
