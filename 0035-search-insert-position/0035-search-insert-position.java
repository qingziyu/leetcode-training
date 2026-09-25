class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while(leftPointer <= rightPointer) {
            int midPointer = (rightPointer - leftPointer)/2 + leftPointer;
            int midNum = nums[midPointer];

            if (midNum < target) {
                leftPointer = midPointer + 1;
            } else if (midNum > target) {
                rightPointer = midPointer - 1;
            } else {
                return midPointer;
            }
        }

        return leftPointer;
    }
}