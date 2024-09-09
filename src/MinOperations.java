public class MinOperations {
    public static void main(String[] args) {
        String s1 = "0100";
        String s2 = "1111";
        String s3 = "10";
        System.out.println(minOperations(s1));
        System.out.println(minOperations(s2));
        System.out.println(minOperations(s3));
    }

    public static int minOperations(String s) {
        int zero = 0, one = 0;
        char startZeroPrev = '1', startOnePrev = '0';

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '0': {
                    if (startZeroPrev == '1') {
                        startZeroPrev = '0';
                    } else {
                        zero++;
                        startZeroPrev = '1';
                    }
                    if (startOnePrev == '1') {
                        startOnePrev = '0';
                    } else {
                        one++;
                        startOnePrev = '1';
                    }
                    break;
                }
                case '1' : {
                    if (startZeroPrev == '0') {
                        startZeroPrev = '1';
                    } else {
                        zero++;
                        startZeroPrev = '0';
                    }
                    if (startOnePrev == '0') {
                        startOnePrev = '1';
                    } else {
                        one++;
                        startOnePrev = '0';
                    }
                    break;
                }
            }
        }

        return Math.min(zero, one);
    }
}
