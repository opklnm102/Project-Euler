/**
 * 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
 * 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
 * <p>
 * 1 ~ 10의 최소공배수는 2520
 * 1 ~ 20의 최소공배수 구하기
 * <p>
 * 최소공배수를 구하려면 최대공약수 이용
 * 최대공약수를 구하려면 유클리드 호제법 이용
 */
public class Problem5 {

    public static void main(String[] args) {

        int max = 2520;

        // 1 ~ 10까지는 알고 있으니 그것과 11 ~ 20의 최소공배수를 차례대로 구해간다
        for (int i = 11; i < 21; i++) {
            max = max / gcd(max, i) * i;
        }

        System.out.println(String.valueOf(max));  // 232792560
    }

    // 유클리드 호제법
    public static int gcd(int a, int b) {
        int mod = a % b;
        while (mod > 0) {
            a = b;
            b = mod;
            mod = a % b;
        }
        return b;
    }
}