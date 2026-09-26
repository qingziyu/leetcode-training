class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int leftPointer = 0;
        int rightPointer = k - 1;
        int maxResult = 0;
        int previousResult = 0;

        for (int i = 0; i <= rightPointer; i++) {
            maxResult += nums[i];
        }
        
        previousResult = maxResult;

        while(rightPointer < nums.length - 1) {
            int previousLeft = nums[leftPointer];
            int currentRight = nums[rightPointer + 1];
            int currentResult = previousResult - previousLeft + currentRight;

            if (currentResult > maxResult) {
                maxResult = currentResult;
            }

            leftPointer++;
            rightPointer++;
            previousResult = currentResult;
        }

        return (double) maxResult/k;
    }
}