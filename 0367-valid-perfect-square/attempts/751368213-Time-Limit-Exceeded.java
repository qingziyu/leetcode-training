class Solution {
    public boolean isPerfectSquare(int num) {
        int leftPointer = 0;
        int rightPoint = num;

        while(leftPointer <= rightPoint) {
            int mid = (rightPoint - leftPointer)/2 + leftPointer;
            int result = mid*mid;
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