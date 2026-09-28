class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int leftPointer = 0;
        int rightPointer = 0;
        int currentSum = nums[0];
        int miniSize = 0;

        while (rightPointer <= nums.length - 1) {
            int leftNum = nums[leftPointer];
            int rightNum = nums[rightPointer];
            rightPointer++;

            if(currentSum < target) {
                currentSum += rightNum;
            } else {
                if(miniSize == 0) {
                    miniSize = rightPointer - leftPointer;
                }

                if (currentSum - leftNum > target) {
                    leftPointer++;
                    miniSize--;
                }
            }
        }

        return miniSize;
    }
}