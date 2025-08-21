class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // Trim trailing spaces and split by spaces
        String[] words = s.trim().split("\\s+");
        
        // Get the last word and return its length
        return words[words.length - 1].length();
    }
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();
        
        // Test cases
        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";
        String test4 = "a";
        System.out.println(solution.lengthOfLastWord(test3)); 


    }
}