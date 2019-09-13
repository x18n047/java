import java.io.*;

public class Login {
	public static void main(String args[])throws IOException {
		final String acID = "x99n999";
		final char passChar = 'f';
		final int passNo = 4251051;
		
		
		char passwordChar;
		int passwordNo;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("accountID > " );
		String accountID = br.readLine();
		System.out.print("passwordChar >");
		passwordChar = br.readLine().charAt(0);
		System.out.print("passwordNo >");
		passwordNo = Integer.parseInt(br.readLine());
		
		if( !accountID.equals(acID)) {
			System.out.println("accountIDが違います。処理を終了します。");
		}else if(passwordChar != passChar){
			System.out.println("passwordcharが違います。処理を終了します。");
		}else if(passwordNo != passNo){
			System.out.println("accountIDが違います。処理を終了します。");
		}else {
		System.out.println("あなたは認証されました。");
	}
}
}