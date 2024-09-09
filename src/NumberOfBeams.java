import java.util.Arrays;

public class NumberOfBeams {
    public static void main(String[] args) {
        String[] bank1 = {"011001","000000","010100","001000"};
        String[] bank2 = {"000","111","000"};
        System.out.println(numberOfBeams(bank1));
        System.out.println(numberOfBeams(bank2));
    }
    public static int numberOfBeams(String[] bank) {
        int prevRowNum = 0;
        int result = 0;

        for (String row : bank) {
            int count = onesCount(row.toCharArray());
            if (count > 0) {
                result += prevRowNum * count;
                prevRowNum = count;
            }
        }

        return result;
    }

    private static int onesCount(char[] chars) {
        int res = 0;
        for (char ch : chars) {
            if (ch == '1') {
                res++;
            }
        }
        return res;
    }
}
