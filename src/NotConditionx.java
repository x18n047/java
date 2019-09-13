import java.io.*;

public class NotConditionx {
	public static void main(String args[])throws IOException{
		String BLOOD_TYPE_A = "A";

		String bloodType;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("あなたの血液型を入力してください>");
		bloodType = br.readLine();
		if(!bloodType.equals(BLOOD_TYPE_A)) {
			System.out.println("あなたは" + BLOOD_TYPE_A + "型ではありません。" + bloodType + "型ですね");
		}else {
			System.out.println("あなたは" + bloodType + "型ですね、ぜひ献血をお願いします。");
		}
	}
}


//あなたの血液型を入力してください>A
//あなたはA型ですね、ぜひ献血をお願いします。

//あなたの血液型を入力してください>B
//あなたはA型ではありません。B型ですね
