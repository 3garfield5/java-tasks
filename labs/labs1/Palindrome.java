package lab1;
public class Palindrome {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String word = args[i];
            System.out.println(isPalindrome(word, reverseString(word)));
        }

    }

    public static String reverseString(String word) {
        String revers = "";
        for (int b = 0; b < word.length(); b++) {
            revers = word.charAt(b) + revers;
        }
        return revers;
    }

    public static boolean isPalindrome(String first, String second) {
        return first.equals(second);
    }
}
