class Solution {
    public int search(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while(leftPointer <= rightPointer) {
            int midPointer  = (rightPointer - leftPointer)/2 + leftPointer;
            int midNum = nums[midPointer];

            if (target == midNum) {
                return midPointer;
            } else if (target > midNum) {
                leftPointer = midPointer + 1;
            } else {
                rightPointer = midPointer - 1;
            }
        }

        return -1;
    }
}