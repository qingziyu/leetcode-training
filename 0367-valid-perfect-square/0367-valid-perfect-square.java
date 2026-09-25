class Solution {
    public boolean isPerfectSquare(int num) {
        long leftPointer = 0;
        long rightPoint = num;

        while(leftPointer <= rightPoint) {
            long mid = (rightPoint - leftPointer)/2 + leftPointer;
            long result = mid*mid;
            if (result > num) {
                rightPoint = mid - 1;
            } else if (result < num) {
                leftPointer = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}