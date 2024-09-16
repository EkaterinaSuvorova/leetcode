//https://leetcode.com/problems/minimum-bit-flips-to-convert-number/?envType=daily-question&envId=2024-09-11
//2220. Minimum Bit Flips to Convert Number
public class MinBitFlips {
    public int minBitFlips(int start, int goal) {
        String startString = Integer.toBinaryString(start);
        String goalString = Integer.toBinaryString(goal);

        int diffLength = Math.abs(startString.length() - goalString.length());

        if (startString.length() < goalString.length()) {
            startString = "0".repeat(diffLength) + startString;
        } else if (startString.length() > goalString.length()) {
            goalString = "0".repeat(diffLength) + goalString;
        }

        char[] startChars = startString.toCharArray();
        char[] goalChars = goalString.toCharArray();
        int counter = 0;

        int i = 0;
        while (i < startChars.length) {
            if (startChars[i] != goalChars[i]) {
                counter++;
            }
            i++;
        }
        return counter;
    }

    public int minBitFlipsXor(int start, int goal) {
        int counter = 0;
        int xor = start ^ goal;

        while (xor != 0) {
            counter += xor & 1;
            xor >>= 1;
        }

        return counter;
    }
}
