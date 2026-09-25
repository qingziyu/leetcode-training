class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int midPoiner = (leftPointer + rightPointer)/2;

        while(leftPointer <= rightPointer) {
            int currentMid = nums[midPoiner];

            if (leftPointer == rightPointer && currentMid != target) {
                break;
            }

            if (currentMid == target) {
                return midPoiner;
            } else if (currentMid < target) {
                leftPointer = midPoiner + 1;
            } else {
                rightPointer = midPoiner - 1;
            }
        }

        return midPoiner;
    }
}