class Solution {
    public int mySqrt(int x) {
        int leftPointer = 0;
        int rightPointer = x;

        while(leftPointer < rightPointer) {
            int mid = (rightPointer - leftPointer + 1)/2 + leftPointer;
            int result = mid*mid;

            if(result > x) {
                rightPointer = mid - 1;
            } else if (result < x) {
                leftPointer = mid;
            } else {
                return mid;
            }
        }

        return rightPointer;
    }
}