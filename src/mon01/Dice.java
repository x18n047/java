package mon01;
/*
 * 問題のある部分を修正し、以下のように出力してください。
 * 
 * 
 * ----- 期待される出力結果
エンターキーを押すとサイコロを振ります。(終了は他のキーを押してエンター)
出たサイコロの目は　5 です。

エンターキーを押すとサイコロを振ります。
出たサイコロの目は　2 です。

エンターキーを押すとサイコロを振ります。
出たサイコロの目は　4 です。
 */
import java.util.Random;
import java.io.IOException;
public class Dice {
	private static Random rnd = new Random(System.currentTimeMillis());
	private static final int KEY_ENTER = 13;
	public static void main(String[] args) throws IOException {

		int dice = 0;
		
		System.out.println("エンターキーを押すとサイコロを振ります。(終了は他のキーを押してエンター)");
		
		while (System.in.read() == KEY_ENTER) {
			dice = rnd.nextInt();
			System.out.println("出たサイコロの目は " + dice + " です。\n");
			System.in.read();
		}
		System.out.println("終了");
	}
}
