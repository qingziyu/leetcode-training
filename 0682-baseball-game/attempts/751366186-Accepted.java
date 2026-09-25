class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        for (int i = 0; i < operations.length; i++) {
            String currentStr = operations[i];
            if (currentStr.matches("-?[0-9]+")) {
                stack.push(Integer.parseInt(currentStr));
            } else if (currentStr.equals("C")) {
                stack.pop();
            } else if (currentStr.equals("D")) {
                int currentNum = stack.peek();
                stack.push(currentNum*2);
            } else {
                int topInt = stack.pop();
                int secInt = stack.peek();

                stack.push(topInt);
                stack.push(secInt + topInt);
            }
        }

        while(!stack.isEmpty()) {
            int topNum = stack.pop();
            result = topNum + result;
        }

        return result;
    }
}