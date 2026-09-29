class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int rightPointer = 0;
        Map<Character, Integer> charToIndexMap = new HashMap<>();
        int result = 1;

        if(s.length() == 0) {
            return 0;
        }

        while(leftPointer < s.length() - 1) {
            char currentRight = s.charAt(rightPointer);
            
            if(charToIndexMap.containsKey(currentRight)) {
                int index = charToIndexMap.get(currentRight);
                if(index >= leftPointer) {
                    leftPointer = index + 1;
                }
            }

            charToIndexMap.put(currentRight, rightPointer);
            int currentLength = rightPointer - leftPointer + 1;
            if (currentLength > result) {
                result = currentLength;
            }

            if (rightPointer < s.length() - 1) {
                rightPointer++;
            } else {
                leftPointer++;
            }
        }

        return result;
    }
}