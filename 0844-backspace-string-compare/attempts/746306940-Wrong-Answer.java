class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack = new ArrayDeque<>();
        int count = 0;

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
                count++;
            } else if (currentChar != '#' && count > 0) {
                count--;
                continue;
            } else if (currentChar == stack.peek()) {
                stack.remove();       
            } else {
                return false;
            }
        }

        return true;
    }
}