class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (stack.size() > 0 && c == '#') {
                stack.remove();
            } else if (c != '#') {
                stack.push(c);
            }
        }

        for (int i = t.length() - 1; i >= 0; i--) {
            char currentChar = t.charAt(i);
            if (currentChar == '#') {
                if (i > 0) {
                    i--;
                }
            } else if (currentChar == stack.peek()) {
                stack.remove();       
            } else {
                return false;
            }
        }

        return true;
    }
}