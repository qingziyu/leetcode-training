class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> resultFrequencyMapOne = new HashMap<>();
        Map<Integer, Integer> resultFrequencyMapTwo = new HashMap<>();

        resultFrequencyMapOne = getResultFrequency(nums1, nums2, resultFrequencyMapOne);
        resultFrequencyMapTwo = getResultFrequency(nums3, nums4. resultFrequencyMapTwo);

        int result = 0;

        for (Map.Entry<Integer, Integer> entry : resultFrequencyMapOne.entrySet()) {
            int currentSSum = entry.getKey();
            int times = entry.getValue();
            int neededSum = 0 - currentSSum;

            if (resultFrequencyMapTwo.containsKey(neededSum)) {
                result += times * resultFrequencyMapTwo.get(neededSum);
            }
        }

        return result;
    }

    private HashMap getResultFrequency(int[] nums1, int[] nums2, HashMap resultFrequencyMap) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                resultFrequencyMap.put(sum, resultFrequencyMap.getOrDefault(sum, 0) + 1);
            }
        }
    }
}