
/*
 * Largest palindrome product
 * �տ������� ���� ���� �ڿ������� ���� ���� ����� ���� ���� ��Ī��(palindrome)��� �θ��ϴ�.
 * �� �ڸ� ���� ���� ���� �� �ִ� ��Ī�� �� ���� ū ���� 9009 (= 91 �� 99) �Դϴ�.
 * �� �ڸ� ���� ���� ���� �� �ִ� ���� ū ��Ī���� ���Դϱ�?
 */
public class Four {

	public static void main(String[] args) {

		int max = 0;

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int num = i * j;
				StringBuilder sbNum = new StringBuilder(""+num);
				sbNum.reverse();
				
				if(num == Integer.parseInt(sbNum.toString()) && num > max){
					max = num;
				}
			}
		}
		System.out.println(max);
	}
}
