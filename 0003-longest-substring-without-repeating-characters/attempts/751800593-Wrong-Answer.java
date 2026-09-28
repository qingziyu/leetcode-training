class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftPointer = 0;
        int rightPointer = 0;
        Map<Character, Integer> seenMap = new HashMap<>();
        int longest = 0;

        while(rightPointer <= s.length() - 1) {
            char currentChar = s.charAt(rightPointer);
            if (!seenMap.containsKey(currentChar)) {
                seenMap.put(currentChar, rightPointer);
                if (rightPointer - leftPointer + 1 > longest) {
                    longest = rightPointer - leftPointer + 1;
                }

                rightPointer++;
            } else {
                int index = seenMap.get(currentChar);
                if (index >= leftPointer) {
                    leftPointer = index + 1;
                }
                seenMap.put(currentChar, rightPointer);
                rightPointer++;
            }
        }

        return longest;
    }
}