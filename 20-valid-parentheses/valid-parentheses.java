class Solution {
    public boolean isValid(String s) {
         HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (bracketMap.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                
                if (topElement != bracketMap.get(c)) {
                    return false;
                }
            } else {
                
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}