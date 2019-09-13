
public class Switchy {
	public static void main(String[] args) {
		int ransu = (int)(Math.random() * 10);
		System.out.println("ransu = " + ransu);
		switch(ransu){
		case 0:
			System.out.println("明日の天気は晴れです。");
			break;
		case 1:
			System.out.println("明日の天気は雨です。");
			break;
		case 2:
			System.out.println("明日の天気は曇りです。");
			break;
		case 3:
			System.out.println("明日の天気は雪です。");
			break;
		default:
			System.out.println("★?&です。");
			break;
		}
	}
}
