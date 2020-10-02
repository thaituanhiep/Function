package function;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumDigits(234));
    }

    public static int sumDigits(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
