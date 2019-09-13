import java.io.*;

public class Switchz {
	public static void main(String[] args)throws IOException {
		char lang;
		System.out.println("日本語:j 英語:e フランス語:f ハングル:h 中国語:c");
		System.out.println("言語を選択してください>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		lang = br.readLine().charAt(0);
		switch (lang) {
		case 'j':
			System.out.println(lang + " おはようございます");
			break;
		case 'e':
			System.out.println(lang + " Good Morning");
			break;
		case 'f':
			System.out.println(lang + " Bonjour");
			break;
		case 'h':
			System.out.println(lang + " アンニョンハセヨ");
			break;
		case 'c':
			System.out.println(lang + " 早上好");
			break;
		default:
			System.out.println("は入力ミスです");
			break;
		}
	}
}
