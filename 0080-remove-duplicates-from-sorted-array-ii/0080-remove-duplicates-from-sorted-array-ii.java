class Solution {
    public int removeDuplicates(int[] nums) {
        int writePointer = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];
            int previousNum = nums[i - 1];

            if (previousNum == currentNum) {
                count++;
                if (count <= 2) {
                    nums[writePointer] = currentNum;
                    writePointer++;
                    continue;
                }
            } else {
                nums[writePointer] = currentNum;
                writePointer++;
                count = 1;
            }
        }

        return writePointer;
    }
}