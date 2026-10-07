class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(curChar);
                continue;
            }

            if (stack.peek() == curChar) {
                stack.pop();
            } else {
                stack.push(curChar);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}