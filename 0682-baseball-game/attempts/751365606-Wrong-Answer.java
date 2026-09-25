class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        for (int i = 0; i < operations.length; i++) {
            String currentStr = operations[i];
            if (currentStr.matches("[0-9]+")) {
                stack.add(Integer.parseInt(currentStr));
            } else if (currentStr == "C") {
                stack.pop();
            } else if (currentStr == "D") {
                int currentNum = stack.peek();
                stack.add(currentNum*2);
            } else {
                int topInt = stack.pop();
                int secInt = stack.peek();

                stack.add(topInt);
                stack.add(secInt + topInt);
            }
        }

        while(!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }
}