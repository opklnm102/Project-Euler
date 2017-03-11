/*
 * Largest prime factor 
 * � ���� �Ҽ��� �����θ� ��Ÿ���� ���� ���μ����ض� �ϰ�, �� �Ҽ����� �� ���� ���μ���� �մϴ�.
 * ���� ��� 13195�� ���μ��� 5, 7, 13, 29 �Դϴ�.
 * 
 * 600851475143�� ���μ� �߿��� ���� ū ���� ���ϼ���.
 */
public class Three {

	public static void main(String[] args) {

		long n = 600851475143L;
		long maxFactor = 0;
		
		for(long i=3; i<=Math.sqrt(n); i+=2){
			if(n % i == 0){
				if(oddIsPrime(i)){
					maxFactor = i;
				}
			}
		}
		System.out.println(maxFactor);
	}
	
	static boolean oddIsPrime(long oddValue){
		
		for(long i = 3; i<= Math.sqrt(oddValue); i+=2){
			if(oddValue % i == 0){
				return false;
			}
		}
		return true;
	}
}
