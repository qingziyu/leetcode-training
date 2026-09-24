class Solution {
    public int removeDuplicates(int[] nums) {
        int writePointer = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];
            int previousNum = nums[i - 1];

            if (currentNum == previousNum) {
                count++;
                nums[writePointer] = nums[i];
                if (count <= 2) {
                    writePointer++;
                }
            } else {
                nums[writePointer] = nums[i];
                count = 1;
                writePointer++;
            }
        }

        return writePointer;
    }
}