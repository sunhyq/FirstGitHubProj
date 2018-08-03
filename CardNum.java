import java.util.Scanner;

public class CardNum {
	public static void main(String[] args) {
		// 输入一个四位 会员卡号，控制台 计算会员卡号的 各位数，并计算各位之和
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个四位数会员卡号：");
		int num = input.nextInt();

		System.out.println("会员卡卡号是：" + num);

		int geWei = num % 10;
		int shiWei = num / 10 % 10;
		int baiWei = num / 100 % 10;
		int qianWei = num / 1000 % 10;
		int zongHe = geWei + shiWei + baiWei + qianWei;

		System.out.println("个位为：" + geWei + "十位为：" + shiWei + "百位为：" + baiWei
				+ "千位为：" + qianWei); // 个位

		System.out.println("会员卡号之和为：" + zongHe); // 千位
		System.out.println((zongHe > 15) ? "您中奖了！奖品是MP3" : "您未中奖！！！！"); // 千位

	}

}
