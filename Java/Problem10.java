package problem10;

import java.util.PrimitiveIterator;
import java.util.function.Predicate;
import java.util.stream.LongStream;

/*
10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.

이백만(2,000,000) 이하 소수의 합은 얼마입니까?
 */
public class Problem10 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        long result = new PrimeSequenceGenerator(2_000_000)
                .generate()
                .sum();

        long endTime = System.currentTimeMillis();

        System.out.println("실행시간: " + (endTime - startTime));  // 3.xx초 걸림
        System.out.println(result);  // 142913828922
    }
}

class PrimeSequenceGenerator {

    long mLimit;

    public PrimeSequenceGenerator(long limit) {
        mLimit = limit;
    }

    public LongStream generate() {

        LongStream.Builder builder = LongStream.builder();
        OddIterator iterator = new OddIterator(x -> x < mLimit);
        builder.add(2);

        while (iterator.hasNext()) {
            builder.add(iterator.nextLong());
        }

        return builder.build()
                .filter(this::isPrimeWithStream);
    }

    private boolean isPrimeWithStream(long num) {
        return num == 3 || num == 5 || LongStream.iterate(3, x -> x + 2)
                .limit(new Double(Math.sqrt(num)).longValue())
                .noneMatch(x -> num % x == 0);
    }

    class OddIterator implements PrimitiveIterator.OfLong {

        private Predicate<Long> predicate;
        private long num;

        public OddIterator(Predicate<Long> predicate) {
            this.predicate = predicate;
            this.num = 1;
        }

        @Override
        public long nextLong() {
            num += 2;
            return num;
        }

        @Override
        public boolean hasNext() {
            return predicate.test(num + 2);
        }
    }
}
