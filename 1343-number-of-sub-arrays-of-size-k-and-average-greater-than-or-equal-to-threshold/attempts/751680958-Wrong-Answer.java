class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int leftPointer = 0;
        int rightPointer = k - 1;
        int result = 0;
        int currentSum = 0;

        for (int i = 0; i <= rightPointer; i++) {
            int currentNum = arr[i];
            currentSum += currentNum;
        }

        while(rightPointer <= arr.length - 1) {
            if(leftPointer != 0) {
                currentSum = currentSum - arr[leftPointer - 1] + arr[rightPointer];
            }
            
            if (currentSum >= threshold) {
                result++;
            }

            leftPointer++;
            rightPointer++;
        }

        return result;
    }
}