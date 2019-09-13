
public class Rei8_HairetuAvg {
	public static void main(String args[]) {
		int[] arrayTensu = { 70, 85, 60, 65, 75};
		
		System.out.println("msg: 配列arrayTensuのデータは");
		
		for(int a = 0; a < arrayTensu.length; a++) {
			System.out.print(arrayTensu[a] + "点  ");
		}
		System.out.println("です。");
	
		
		HairetuAvg ha = new HairetuAvg();
		int avg = ha.yousoAvg(arrayTensu);
		
		System.out.println("配列の平均は" + avg + "点です");
		
	}
}

class HairetuAvg{
	public int  yousoAvg(int[] array) {
		
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		int avg = sum/array.length;
		
		return avg;
	}
}
