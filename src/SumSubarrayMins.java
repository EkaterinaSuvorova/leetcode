import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SumSubarrayMins {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 2, 4};
        int[] arr2 = {11, 81, 94, 43, 3};
        System.out.println(sumSubarrayMins(arr1));
        System.out.println(sumSubarrayMins(arr2));
    }

    public static int sumSubarrayMins(int[] arr) {
        int length = arr.length;
        int[] left = new int[length];
        int[] right = new int[length];

        Arrays.fill(left, -1);
        Arrays.fill(right, length);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < length; ++i) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }

        int mod = (int) 1e9 + 7;
        long answer = 0;

        for (int i = 0; i < length; ++i) {
            answer += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            answer %= mod;
        }

        return (int) answer;
    }
//    public static int sumSubarrayMins(int[] arr) {
//        int i = 0;
//        int right;
//        int sum = 0;
//        int result = 0;
//        int min;
//        while (i < arr.length) {
//            if (i > 0) {
//                sum -= arr[i];
//            }
//            if (i > 0 && arr[i - 1] > arr[i]) {
//                result += sum;
//            } else {
//                right = 0;
//                min = arr[i];
//                while (right < arr.length) {
//                    if (arr[right] < min) {
//                        min = arr[right];
//                    }
//                    if (i == 0) {
//                        sum += min;
//                    }
//                    result += min;
//                    right++;
//                }
//            }
//            i++;
//        }
//        return result;
//    }

//        public static int sumSubarrayMins(int[] arr) {
//        long result = 0;
//        int i = 0;
//        int right;
//        int min, minValue = Integer.MAX_VALUE;
//
//        while (i < arr.length) {
//            if (arr[i] == minValue) {
//                result += (long) arr[i] * (arr.length - i);
//                minValue = Integer.MAX_VALUE;
//            } else {
//                right = i + 1;
//                result += arr[i];
//                min = arr[i];
//                while (right < arr.length) {
//                    if (arr[right] < min) {
//                        min = arr[right];
//                    }
//                    result += min;
//                    right++;
//                }
//                if (min < minValue) {
//                    minValue = min;
//                }
//            }
//            i++;
//        }
//        return (int) (result % 1000000007);
//    }
//    public static int sumSubarrayMins(int[] arr) {
//        long result = 0;
//        int windowLength = 1;
//
//        int i = 0;
//        while (i < arr.length) {
//            int min = arr[i];
//            while (i + windowLength - 1 < arr.length) {
//                if (arr[i + windowLength - 1] < min) {
//                    min = arr[i + windowLength - 1];
//                }
//                result += min;
//                windowLength++;
//            }
//            windowLength = 1;
//            i++;
//        }
//
//        return (int)(result % 1000000007);
//    }
}
