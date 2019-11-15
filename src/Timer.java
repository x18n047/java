import java.io.*;

public class Timer {
	public static void main(String[] args)throws IOException{
		
	System.out.println("msg:入力する秒数を時間、分、秒に変換します。");
	System.out.print("変換する秒数を入力して下さい>");
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	int hh = 0;
	int mm = 0;
	int ss = Integer.parseInt(br.readLine());
	int ss_s = ss;	
	
	
			while (ss >= 3600) {
				if((ss -= 3600) >= 0){
				hh++;
				}
			}while  (ss >= 60) {
				if((ss -= 60) >= 0){
				mm ++;
				}
				}
		
		if(ss_s == 0) {
			System.out.println("処理を終了します。");
		}
		else{System.out.println(ss_s + "秒は、" + hh + "時間" + mm + "分" + ss + "秒です。");
		}
	}
}
