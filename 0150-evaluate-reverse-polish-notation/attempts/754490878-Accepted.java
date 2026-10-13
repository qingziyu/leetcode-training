class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                stack.push(stack.pop() + stack.pop());
                continue; 
            } else if (tokens[i].equals("/")) {
                int topNum = stack.pop();
                int secNum = stack.pop();
                stack.push(secNum / topNum);
                continue; 
            } else if (tokens[i].equals("*")) {
                stack.push(stack.pop() * stack.pop());
                continue; 
            } else if (tokens[i].equals("-")) {
                int topNum = stack.pop();
                int secNum = stack.pop();
                stack.push(secNum - topNum);
                continue; 
            }

            int currentNum = Integer.parseInt(tokens[i]);
            stack.push(currentNum);
        }

        return stack.peek();
    }
}