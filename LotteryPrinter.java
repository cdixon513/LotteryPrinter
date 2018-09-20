import java.util.Random;

public class LotteryPrinter{
	public static void main(String[] args){
		int random1, random2, random3, random4, random5, random6;
		Random random = new Random();

		random1 = random.nextInt(49) + 1;
		random2 = random.nextInt(49) + 1;
		random3 = random.nextInt(49) + 1;
		random4 = random.nextInt(49) + 1;
		random5 = random.nextInt(49) + 1;
		random6 = random.nextInt(49) + 1;

		System.out.println("This combination will make you rich: " + random1 + "-" + random2 + "-" + random3 + "-" + random4 + "-" + random5 + "-" + random6);
	}
}