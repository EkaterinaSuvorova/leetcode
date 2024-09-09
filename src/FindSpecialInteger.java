public class FindSpecialInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) {
        int q = arr.length/4;
        for (int i = 0; i < arr.length - q; i++) {
            if (arr[i] == arr[i + q]){
                return arr[i];
            }
        }
        return -1;
    }

    public static int findSpecialInteger2(int[] arr) {
        int q = arr.length/4;
        for (int i = q; i < 3 * q; ) {
            if (arr[i] == arr[i + q]){
                return arr[i];
            }
        }
        return -1;
    }
}
