public class FindTheFirstIndexOfoccurence {
     public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        
        return -1; 
    }
public static void main(String[] args) {
    System.out.println(strStr("hello", "ll"));
    System.out.println(strStr("aaaaa", "bba"));
    System.out.println(strStr("mississippi", "issip"));
    System.out.println(strStr("abc", "c"));
    System.out.println(strStr("sadbutsad","sad"));
    System.out.println(strStr("leetcode", "leeto"));
}
}