import java.io.*;
	
public class Rei8_3_1x {
	public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("input a1 < ");
        int a1 = Integer.parseInt(br.readLine());
        
        System.out.print("input a2 < ");
        int a2 = Integer.parseInt(br.readLine());

        Calc (a1,a2);

    }

	private static void Calc(int a1, int a2) {
    System.out.println("足し算：" + a1 + "+" + a2 + "=" + (a1+a2));
    System.out.println("引き算：" + a1 + "-" + a2 + "=" + (a1-a2));
    System.out.println("掛け算：" + a1 + "*" + a2 + "=" + (a1*a2));
    System.out.println("割り算：" + a1 + "/" + a2 + "=" + (a1/a2));
    System.out.println("剰除算：" + a1 + "%" + a2 + "=" + (a1%a2));
    }
}

// input a1 < 6
// input a2 < 6
// 足し算：6+6=12
// 引き算：6-6=0
// 掛け算：6*6=36
// 割り算：6/6=1
// 剰除算：6%6=0