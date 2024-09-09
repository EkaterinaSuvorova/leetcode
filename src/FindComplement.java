import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://leetcode.com/problems/number-complement/
//476. Number Complement
public class FindComplement {
    public int findComplement(int num) {
        char[] binaryNum = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < binaryNum.length; i++) {
            binaryNum[i] = binaryNum[i] == '0' ? '1' : '0';
        }

        return Integer.parseInt(String.valueOf(binaryNum), 2);
    }
}
