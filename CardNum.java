import java.util.Scanner;

public class CardNum {
	public static void main(String[] args) {
		// ����һ����λ ��Ա���ţ�����̨ �����Ա���ŵ� ��λ�����������λ֮��
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����λ����Ա���ţ�");
		int num = input.nextInt();

		System.out.println("��Ա�������ǣ�" + num);

		int geWei = num % 10;
		int shiWei = num / 10 % 10;
		int baiWei = num / 100 % 10;
		int qianWei = num / 1000 % 10;
		int zongHe = geWei + shiWei + baiWei + qianWei;

		System.out.println("��λΪ��" + geWei + "ʮλΪ��" + shiWei + "��λΪ��" + baiWei
				+ "ǧλΪ��" + qianWei); // ��λ

		System.out.println("��Ա����֮��Ϊ��" + zongHe); // ǧλ
		System.out.println((zongHe > 15) ? "���н��ˣ���Ʒ��MP3" : "��δ�н���������"); // ǧλ

	}

}
