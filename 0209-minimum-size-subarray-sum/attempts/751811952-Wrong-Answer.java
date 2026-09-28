class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int leftPointer = 0;
        int rightPointer = 0;
        int currentSum = nums[0];
        int miniSize = 0;

        while (leftPointer < nums.length - 1) {
            if (currentSum >= target) {
                if (miniSize == 0) {
                    miniSize = rightPointer - leftPointer + 1;
                }

                if (rightPointer - leftPointer + 1 < miniSize) {
                    miniSize = rightPointer - leftPointer + 1;
                }  
            }

            if (rightPointer < nums.length - 1) {
                rightPointer++;
                int rightNum = nums[rightPointer];
                currentSum += rightNum;
            } else {
                leftPointer++;
                int leftNum = nums[leftPointer];
                currentSum -= leftNum;
            }
        }

        return miniSize;
    }
}