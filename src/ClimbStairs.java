public class ClimbStairs {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        int n3 = 44;
//        System.out.println(climbStairs(n1));
//        System.out.println(climbStairs(n2));
        System.out.println(climbStairs(n3));
    }

    public static int climbStairs(int n) {
        return recursion(n, 0, new int[45]);
    }

    private static int recursion(int n, int count, int[] counter) {
        if (n == 0) {
            return count + 1;
        }
        if (n < 0) {
            return 0;
        }
        int a = 0, b = 0;
        if (counter[n - 1] != 0) {
            a = counter[n - 1];
        } else {
            a = recursion(n - 1, count, counter);
            counter[n - 1]  = a;

        }
        if (n - 2 >= 0 && counter[n - 2] != 0) {
            b = counter[n - 2];
        } else if (n - 2 >= 0) {
            b = recursion(n - 2, count, counter);
            counter[n - 2] = b;
        }
        return a + b;
    }
}
