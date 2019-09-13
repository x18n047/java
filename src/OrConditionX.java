
public class OrConditionX {
	public static void main(String args[]) {
		final int USUALLY_CHARGE = 2000;
		final String FEMALE = "female";
		int charge = USUALLY_CHARGE;
		
		int nenrei = 17;
		String seibetu = "female";
		
		System.out.println("nenrei = " + nenrei );
		System.out.println("seibetu = " + seibetu);
		
		if(nenrei < 18 && seibetu.equals(FEMALE)) {
			System.out.println("msg:入場料が1/2になります。。charge = " + (charge *= 0.5) +"円");
		}else {
			System.out.println("入場料は通常となります。。 charge = " + (charge) + " 円");
		}
	}
}

//nenrei = 17
//seibetu = female
//msg:入場料が1/2になります。。charge = 1000円

//nenrei = 17
//seibetu = male
//入場料は通常となります。。 charge = 2000 円
