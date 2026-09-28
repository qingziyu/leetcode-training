class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int leftPointer = 0;
        int rightPointer = 0;
        int currentSum = nums[0];
        int miniSize = 0;

        while (leftPointer < nums.length - 1) {
            if (currentSum >= target) {
                if (miniSize == 0) {
                    miniSize = rightPointer - leftPointer;
                }

                if (rightPointer - leftPointer < miniSize) {
                    miniSize = rightPointer - leftPointer;
                }  
            }

            int leftNum = nums[leftPointer];
            int rightNum = nums[rightPointer];

            if (rightPointer < nums.length - 1) {
                rightPointer++;
                currentSum += rightNum;
            } else {
                leftPointer++;
                currentSum -= leftNum;
            }
        }

        return miniSize;
    }
}