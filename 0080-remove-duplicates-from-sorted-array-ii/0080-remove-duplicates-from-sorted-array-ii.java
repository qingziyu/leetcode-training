class Solution {
    public int removeDuplicates(int[] nums) {
        int writePointer = 1;
        int count = 1;

        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        for (int i = 1; i < nums.length; i++) {
            int preNum = nums[i - 1];
            int curNum = nums[i];

            if (preNum == curNum) {
                if (count < 2) {
                    nums[writePointer] = curNum;
                    writePointer++;
                }

                count++;
            }

            if (preNum != curNum) {
                nums[writePointer] = curNum;
                writePointer++;
                count = 1;
            }
        }

        return writePointer;
    }
}