/**
 * 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
 * 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
 *
 * 1 ~ 10의 최소공배수는 2520
 * 1 ~ 20의 최소공배수 구하기
 *
 * 최소공배수를 구하려면 최대공약수 이용
 * 최대공약수를 구하려면 유클리드 호제법 이용
 */
public class Problem5 {

    public static void main(String[] args) {

        int num = 11;

        while (true) {
            if (isModFrom1to20(num)) {
                break;
            }
            num++;
        }
        System.out.println(String.valueOf(num));  // 232792560
    }

    public static boolean isModFrom1to20(int num) {

        for (int i = 2; i <= 20; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}