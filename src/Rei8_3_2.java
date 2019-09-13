
public class Rei8_3_2 {
	public static void main(String args[]) {
		System.out.println("msg: コマンドラインから引数を入力しました。");
		
		System.out.println("args.length = " + args.length);
		
		if( args.length == 0) {
			System.out.println("引数がありません。処理を中断します。");
		}else {
			for( int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
			}
		}
	}
}
