public class RevertWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    private static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder(s.length());

        for (int i = 0; i < words.length; i ++) {
            revertWord(builder, words[i]);
            if (i != words.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    private static void revertWord(StringBuilder builder, String word) {
        for (int i = word.length() - 1; i >= 0; i --){
            builder.append(word.charAt(i));
        }
    }
}
