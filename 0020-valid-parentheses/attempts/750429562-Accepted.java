class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            }

            if (stack.isEmpty()) {
                return false;
            }
            
            if (currentChar == ')') {
                if (stack.peek() == '('){
                    stack.pop();
                } else {
                    return false;
                }
            }

            if (currentChar == ']') {
                if (stack.peek() == '['){
                    stack.pop();
                } else {
                    return false;
                }
            }

            if (currentChar == '}') {
                if (stack.peek() == '{'){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}