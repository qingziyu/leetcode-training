class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(currentChar);
                continue;
            }

            if (stack.peek() == currentChar) {
                stack.pop();
            } else {
                stack.push(currentChar);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c : stack) {
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}