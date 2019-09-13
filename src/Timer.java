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
	
		while(ss!=0) {
			while (ss >= 6399) {
				ss -= 3600;
				hh++;
			}while  (ss >= 59) {
				ss -= 60;
				mm ++;
			}
		}
		System.out.println(ss_s + "秒は、" + hh + "時間" + mm + "分" + ss + "秒です。");
	}
}
