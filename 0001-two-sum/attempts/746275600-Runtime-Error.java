class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int targetNum = target - currentNum + 1;

            if (numberIndexMap.containsKey(targetNum)) {
                return new int[]{i, numberIndexMap.get(targetNum)};
            }

            numberIndexMap.put(currentNum, i);
        }   
        throw new IllegalArgumentException("invalid input");
    }
}