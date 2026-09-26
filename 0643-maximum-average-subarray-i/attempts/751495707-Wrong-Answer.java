class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int leftPointer = 0;
        int rightPointer = k - 1;
        int result = 0;

        for (int i = 0; i <= rightPointer; i++) {
            result += nums[i];
        }

        while(rightPointer < nums.length - 1) {
            int previousLeft = nums[leftPointer];
            int currentRight = nums[rightPointer + 1];
            int currentResult = result - previousLeft + currentRight;

            if (currentResult > result) {
                result = currentResult;
            }

            leftPointer++;
            rightPointer++;
        }

        return result;
    }
}