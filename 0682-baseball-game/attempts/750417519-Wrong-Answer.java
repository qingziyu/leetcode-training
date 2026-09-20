class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        for (int i = 0; i < operations.length; i++) {
            String currentStr = operations[i];

            if (currentStr.matches("[+-]?[0-9]+")) {
                stack.push(Integer.parseInt(currentStr));
            } else if (currentStr == "C") {
                stack.pop();
            } else if (currentStr == "D") {
                stack.push(stack.pop());
            } else {
                int first = stack.pop();
                int second = stack.peek();
                int sum = first + second;

                stack.push(first);
                stack.push(sum);
            }
        }

        while(!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}