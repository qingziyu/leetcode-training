class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int leftPointer = 0;
        int rightPointer = 1;

        while(rightPointer <= nums.length - 1) {
            int leftNum = nums[leftPointer];
            int rightNum = nums[rightPointer];

            if (leftNum == rightNum) {
                return true;
            }

            if (rightPointer - leftPointer == k) {
                leftPointer++;
            } else if (rightPointer - leftPointer < k) {
                rightPointer++;
            }
        }

        return false;
    }
}