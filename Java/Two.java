import java.math.BigInteger;

/*
 * Even Fibonacci numbers
 * �Ǻ���ġ ������ �� ���� �ٷ� ���� �� �� ���� ���� ���� �˴ϴ�. 1�� 2�� �����ϴ� ��� �� ������ �Ʒ��� �����ϴ�.
 *	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * ¦���̸鼭 4�鸸 ������ ��� ���� ���ϸ� �󸶰� �˴ϱ�?
 */
public class Two {
	public static void main(String[] args) {
		
		int sum = 2;
		
		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("2");
		BigInteger even = new BigInteger("2");
		
		for(int i=0; i<1000; i++){
			BigInteger n3 = n1.add(n2);
			
			if(n3.intValue() > 4000000){
				break;
			}
			if(n3.mod(even).intValue() == 0){
				sum += n3.intValue();
			}
			n1 = n2;
			n2 = n3;
		}
		
		System.out.println(sum);
	}
}
