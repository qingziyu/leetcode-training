class Solution {
    public int removeDuplicates(int[] nums) {
        int writePointer = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            int writePointerNum = nums[writePointer];
            int currentNum = nums[i];

            if (writePointerNum == currentNum) {
                if (count <= 2) {
                    writePointer++;
                    count++;
                    continue;
                } else {
                    count++;
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