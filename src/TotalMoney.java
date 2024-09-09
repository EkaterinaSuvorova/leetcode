public class TotalMoney {
    public static void main(String[] args) {
        System.out.println(totalMoney(20));
    }
    public static int totalMoney(int n) {
        int weeks = n / 7;
        int extra_days = n % 7;

        int result = 28 * weeks;
        result += 7 * weeks * (weeks - 1) / 2;

        for (int i = extra_days; i > 0; i--) {
            result += weeks + i;
        }
        return result;
    }


}
