class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++) {
            int currentNum = nums1[i];

            frequencyMap.put(currentNum, frequencyMap.getOrDefault(currentNum, 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            int currentNum = nums2[i];
            if (frequencyMap.containsKey(currentNum)) {
                list.add(currentNum);

                if (frequencyMap.get(currentNum) > 1) {
                    int count = frequencyMap.get(currentNum);
                    frequencyMap.put(currentNum, count - 1);
                } else {
                    frequencyMap.remove(currentNum);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}