
	import java.io.IOException;
	
public class Array3 {
	private static final String ARRAY = "array";

	public static void main(String[] args) throws IOException {

		final int n = 3;
		int[][][] array3 = new int[n][n][n];

		System.out.println("msg:三次元配列array3(3**3*3)に1から27のデータを割り当てます。");

		for (int i = 0; i < array3.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < array3[i].length; j++) {
				for (int k = 0; k < array3[i][j].length; k++) {

					System.out.print(
							ARRAY + "[" + i + "]" + "[" + j + "]" + "[" + k + "]" + "=" + ((i * 9 + j * 3 + k * 1) + 1) + "   ");

					if (k == 2) {
						System.out.println("");
					}
				}
			}
		}

		System.out.println("\n");
		System.out.println("msg:三次元配列array3(3*3*3)を後ろから読んでいます。");

		for (int i = 0; i < array3.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < array3[i].length; j++) {
				for (int k = 0; k < array3[i][j].length; k++) {

					int k2 = 27 - (i * 9 + j * 3 + k * 1);
					System.out.print(ARRAY + "[" + i + "]" + "[" + j + "]" + "[" + k + "]" + "=" + k2 + "   ");

						if(k==2){
							System.out.println("");
						}
					}
				}
		}
    
    }
}


// msg:三次元配列array3(3**3*3)に1から27のデータを割り当てます。

// array[0][0][0]=1   array[0][0][1]=2   array[0][0][2]=3
// array[0][1][0]=4   array[0][1][1]=5   array[0][1][2]=6
// array[0][2][0]=7   array[0][2][1]=8   array[0][2][2]=9

// array[1][0][0]=10   array[1][0][1]=11   array[1][0][2]=12
// array[1][1][0]=13   array[1][1][1]=14   array[1][1][2]=15
// array[1][2][0]=16   array[1][2][1]=17   array[1][2][2]=18

// array[2][0][0]=19   array[2][0][1]=20   array[2][0][2]=21
// array[2][1][0]=22   array[2][1][1]=23   array[2][1][2]=24
// array[2][2][0]=25   array[2][2][1]=26   array[2][2][2]=27


// msg:三次元配列array3(3*3*3)を後ろから読んでいます。

// array[0][0][0]=27   array[0][0][1]=26   array[0][0][2]=25
// array[0][1][0]=24   array[0][1][1]=23   array[0][1][2]=22
// array[0][2][0]=21   array[0][2][1]=20   array[0][2][2]=19

// array[1][0][0]=18   array[1][0][1]=17   array[1][0][2]=16
// array[1][1][0]=15   array[1][1][1]=14   array[1][1][2]=13
// array[1][2][0]=12   array[1][2][1]=11   array[1][2][2]=10

// array[2][0][0]=9   array[2][0][1]=8   array[2][0][2]=7
// array[2][1][0]=6   array[2][1][1]=5   array[2][1][2]=4
// array[2][2][0]=3   array[2][2][1]=2   array[2][2][2]=1