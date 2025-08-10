import java.util.Stack;
public class Valid_Parenthesis {
    public static boolean isValid(String s) {
        
     Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }  

    public static void main(String[] args) {
        Valid_Parenthesis solution = new Valid_Parenthesis();
        
        // Test cases
        System.out.println(solution.isValid("()"));      // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]"));      // false
        System.out.println(solution.isValid("([)]"));    // false
        System.out.println(solution.isValid("{[]}"));    // true
    }
}
