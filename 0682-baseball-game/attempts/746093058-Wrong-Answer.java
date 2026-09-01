class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        for (String s : operations) {
            if (Character.isDigit(s.charAt(0)) || s.charAt(0) == '-') {
                stack.push(Integer.parseInt(s));
            } else if (s.charAt(0) == '+') {
                int tmpOne = stack.removeFirst();
                int tmpTwo = stack.peek();
                int sum = tmpOne + tmpTwo;
                stack.push(tmpOne);
                stack.push(sum);
            } else if (s.charAt(0) == 'D') {
                int tmp = stack.peek();
                stack.push(tmp*2);
            } else if (s.charAt(0) == 'C') {
                //stack.remove();
            }
        }

       
        while(stack.size() > 0) {
            result += stack.removeFirst();
        }

        return result;
    }
}