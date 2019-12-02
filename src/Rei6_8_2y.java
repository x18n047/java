import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
public class Rei6_8_2y {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("gyo数を入力してください < ");
		int gyo = Integer.parseInt(br.readLine());
		int[][] triMatrix = new int[gyo][];
		
		for (int i=0; i<gyo; i++) {
		System.out.print((i+1) + "行目には何個の列を作成しますか？ < ");
		int retu = Integer.parseInt(br.readLine());
		triMatrix[i] = new int [retu];
		}
		System.out.println("配列にデータを設定します。");
		System.out.println("配列の内容を順に表示します。");
		
		for(int x=0; x<gyo; x++) {
			System.out.print("\t"+(x+1)+"列"+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		for(int i=0; i<gyo; i++) {
			System.out.print((i+1) + "行" + "\t");
		 for(int j=0; j<triMatrix[i].length; j++) {
				triMatrix[i][j] = (i+1)*10+(j+1);
				System.out.print(triMatrix[i][j]+"\t");
			}
		 System.out.println();
		}
	}
	}


//gyo数を入力してください < 5
//1行目には何個の列を作成しますか？ < 1
//2行目には何個の列を作成しますか？ < 2
//3行目には何個の列を作成しますか？ < 3
//4行目には何個の列を作成しますか？ < 4
//5行目には何個の列を作成しますか？ < 5
//配列にデータを設定します。
//配列の内容を順に表示します。
//	1列 	2列 	3列 	4列 	5列 
//------------------------------------------------------------
//1行	11	
//2行	21	22	
//3行	31	32	33	
//4行	41	42	43	44	
//5行	51	52	53	54	55	



//gyo数を入力してください < 7
//1行目には何個の列を作成しますか？ < 5
//2行目には何個の列を作成しますか？ < 4
//3行目には何個の列を作成しますか？ < 3
//4行目には何個の列を作成しますか？ < 2
//5行目には何個の列を作成しますか？ < 1
//6行目には何個の列を作成しますか？ < 0
//7行目には何個の列ｓを作成しますか？ < 7
//配列にデータを設定します。
//配列の内容を順に表示します。
//	1列 	2列 	3列 	4列 	5列 	6列 	7列 
//------------------------------------------------------------
//1行	11	12	13	14	15	
//2行	21	22	23	24	
//3行	31	32	33	
//4行	41	42	
//5行	51	
//6行	
//7行	71	72	73	74	75	76	77	
