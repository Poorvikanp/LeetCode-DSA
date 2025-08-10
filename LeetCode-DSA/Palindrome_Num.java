public class Palindrome_Num {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;  // This variable isn't actually used in the logic

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);
    }

    public static void main(String[] args) {
        
           System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(139));
    }
}