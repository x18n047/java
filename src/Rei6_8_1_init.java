
public class Rei6_8_1_init {
	public static void main(String args[]) {
		int[][] arrayMat = {{11,12,13,14},{21,22,23,24},{31,32,33,34}};
		
		System.out.println("msg:2次元配列を先頭から出力する");
		
		//for文の入れ子を利用して2次元配列の値を左上から右下へと
		for(int i = 0; i  < arrayMat.length; i++) {
			//arrayMat上でiは0行目から2行目までの3回分繰り返す
			for(int j = 0; j < arrayMat[i].length; j++) {
				//arrayMAt上ではjは対象の行の0列目から3列目までの4回分繰り返す
					System.out.print(arrayMat[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
