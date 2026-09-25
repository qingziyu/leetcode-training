class Solution {
    public int mySqrt(int x) {
        long leftPointer = 0;
        long rightPointer = x;

        while(leftPointer < rightPointer) {
            long mid = (rightPointer - leftPointer + 1)/2 + leftPointer;
            long result = mid*mid;

            if(result > x) {
                rightPointer = mid - 1;
            } else if (result < x) {
                leftPointer = mid;
            } else {
                return (int) mid;
            }
        }

        return rightPointer;
    }
}