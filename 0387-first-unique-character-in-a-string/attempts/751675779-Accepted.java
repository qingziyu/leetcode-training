class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> seenMap = new HashMap<>();
        int result = -1;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            seenMap.put(currentChar, seenMap.getOrDefault(currentChar, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (seenMap.get(currentChar) == 1) {
                result = i;
                break;
            }
        }

        return result;
    }
}