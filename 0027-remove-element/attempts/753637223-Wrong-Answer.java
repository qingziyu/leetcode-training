class Solution {
    public int removeElement(int[] nums, int val) {
        int writePointer = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            int currentInt = nums[i];
            if (currentInt != val) {
                nums[writePointer] = currentInt;
                writePointer++;
            }
        }

        return writePointer;
    }
}