class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seenNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];

            if(i == 0) {
                seenNums.add(currentNum);
                continue;
            }

            if (seenNums.contains(currentNum)) {
                return true;
            } else {
                seenNums.add(currentNum);
            }

            if (i >= k) {
                int removeInt = nums[i - k];
                seenNums.remove(removeInt);
            }
        }

        return false;
    }
}