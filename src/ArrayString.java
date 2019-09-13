
public class ArrayString {
	public static void main(String args[]) {
		String[] kisetu = {"春","夏","秋","冬"};
		String[] season = {"spring","summer","autumn","winter"};
		
		System.out.println("msg: 季節を順に表示します。");
		int i;
		for(i=0;i<kisetu.length;i++) {
			System.out.println(kisetu[i] + "は" + season[i]);
		}
		
		System.out.println("");
		System.out.println("msg: 季節を逆から表示します。");
		
		int j;
		for(j=kisetu.length-1;j>=0;j--) {
			System.out.println(kisetu[j] + "は" + season[j]);
		}
	}
}
