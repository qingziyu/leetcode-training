class Solution {
    public int search(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int midPointer = (leftPointer + rightPointer) / 2;

        while (leftPointer <= rightPointer) {
            int currentNum = nums[midPointer];

            if (currentNum == target) {
                return midPointer;
            } else if (currentNum > target) {
                rightPointer = midPointer;
            } else {
                leftPointer = midPointer;   
            }

            midPointer = (leftPointer + rightPointer) / 2;
        }

        return -1;
    }
}