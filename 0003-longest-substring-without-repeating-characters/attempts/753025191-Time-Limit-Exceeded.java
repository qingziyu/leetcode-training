class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int rightPointer = 1;
        Map<Character, Integer> indexMap = new HashMap<>();
        int longestResult = 1;

        while(rightPointer <= s.length() - 1) {
            char rightChar = s.charAt(rightPointer);

            if (indexMap.containsKey(rightChar)) {
                leftPointer = indexMap.get(rightChar) + 1;
                indexMap.put(rightChar, rightPointer);
            } else {
                indexMap.put(rightChar, rightPointer);
                rightPointer++;
            }

            int tmpLength = rightPointer - leftPointer + 1;
            if (tmpLength > longestResult) {
                longestResult = tmpLength;
            }
        }

        return longestResult;
    }
}