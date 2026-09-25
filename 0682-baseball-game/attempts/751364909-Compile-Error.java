class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new Deque<>();
        int result = 0;

        for (int i = 0; i < operations.length(); i++) {
            String currentStr = operations[i];
            if (currentStr.matches("[0-9]+")) {
                stack.add(Integer.parseInt(currentStr));
            } else if (currentStr == "C") {
                stack.pop();
            } else if (currentStr == "D") {
                int topInt = Integer.parseInt(currentStr);
                stack.add(topInt*2);
            } else {
                int topInt = Integer.parseInt(currentStr);
                stack.pop();
                int secInt = Integer.parseInt(stack.peek());

                stack.add(secInt);
                stack.add(topInt);
                stack.add(secInt + topInt);
            }
        }

        while(!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}