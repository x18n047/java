import java.io.*;
	
public class Rei8_3_1x {
	public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("input a1 < ");
        int a1 = Integer.parseInt(br.readLine());
        
        System.out.print("input a2 < ");
        int a2 = Integer.parseInt(br.readLine());

        Calc cl = new Calc();

        Calc cl2 = cl;
        int tasu = cl2.add(a1, a2);
        System.out.println("合計=" + tasu);

        int hiku = cl2.min(a1, a2);
        System.out.println("引き算=" + hiku);

        int kake = cl2.mul(a1, a2);
        System.out.println("掛け算=" + kake);

        int waru = cl2.dev(a1, a2);
        System.out.println("割り算=" + waru);

        int amari = cl2.rem(a1, a2);
        System.out.println("剰余算=" + amari);

    }
}

class Calc {
    public int add(int b1, int b2){

        int tasu = b1 + b2;
        return tasu;
    }

    public int min(int b1, int b2){
        int hiku = b1 - b2;
        return hiku;
    }

    public int mul(int b1, int b2){
        int kake = b1 * b2;
        return kake;
    }

    public int dev(int b1, int b2){
        int waru = b1 / b2;
        return waru;
    }

    public int rem(int b1, int b2){
        int amari = b1 % b2;
        return amari;
    }
}
