
public class AndConditionx {
	public static void main(String args[]) {
		final int USUALLY_CHARGE = 2000;
		final String MALE = "male";
		int charge = USUALLY_CHARGE;

		int nenrei = 17;
		String seibetu = "male";
		String day = "驥第屆譌･";
		boolean ticket = false;

		System.out.println("nenrei = " + nenrei);
		System.out.println("seibetu = " + seibetu);
		System.out.println("day = " + day);
		System.out.println("ticket = " + ticket);

		if (nenrei >= 18 && seibetu.equals(MALE) && day.equals("驥第屆譌･") && (ticket == false)) {
			System.out.println("msg:蜈･蝣ｴ譁吶′2蜑ｲ蠅励＠縺ｫ縺ｪ繧翫∪縺吶�Ｄharge = " + (charge *= 1.2) + "蜀�");
		} else {
			System.out.println("蜈･蝣ｴ譁吶′2蜑ｲ蠑輔″縺ｫ縺ｪ繧翫∪縺吶�� charge = " + (charge *= 0.8) + " 蜀�");
		}
		// public static boolean ticket(String string) {
		// return false;
	}
}
