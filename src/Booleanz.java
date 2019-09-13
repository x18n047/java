
public class Booleanz {
	public static void main(String args[]) {
		int a,b;
		boolean flag1,flag2,flag3;
		
		System.out.println("msg:int型変数aに10をbに20を代入する");
		
		a = 10;
		b = 20;
		
		System.out.println("変数aの値は" + a + "変数bの値は" + b + "です");
		System.out.println();
		
		System.out.println("msg:boolean変数flagにa<bの結果を代入します。flag1 = a < b");
		flag1 = a < b;
		System.out.println("flag1の値は" + flag1 + "です");
		
		System.out.println("msg:boolean変数flagにa>bの結果を代入します。flag1 = a < b");
		flag2 = a > b;
		System.out.println("flag1の値は" + flag2 + "です");
		
		System.out.println("msg:boolean変数flagにa=bの結果を代入します。flag1 = a < b");
		flag3 = a == b;
		System.out.println("flag1の値は" + flag3 + "です");
		
	}
}
