public class BuyChoco {
    public static void main(String[] args) {
        int[] prices = {3, 2, 3};
        int money = 3;
        System.out.println(buyChoco(prices, money));
    }

    public static int buyChoco(int[] prices, int money) {
        int min1 = 101, min2 = 101;
        for (int p : prices) {
            if (p < min2) {
                if (p < min1) {
                    min2 = min1;
                    min1 = p;
                } else {
                    min2 = p;
                }
            }
        }
        return min1 + min2 <= money ? money - min2 - min1 : money;
    }
}
