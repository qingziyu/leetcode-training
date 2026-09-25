class Solution {
    public int mySqrt(int x) {
        int leftPointer = 1;
        int rightPointer = x - 1;

        while(leftPointer < rightPointer) {
            int mid = (rightPointer - leftPointer)/2 + leftPointer;
            int result = mid*mid;

            if(result > x) {
                rightPointer = mid - 1;
            } else if (result < x) {
                leftPointer = mid + 1;
            } else {
                return mid;
            }
        }

        return rightPointer;
    }
}