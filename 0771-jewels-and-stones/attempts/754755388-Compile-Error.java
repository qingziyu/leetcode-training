class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsSet = new HashSet<>();
        int result = 0;

        for (int i = 0; i < jewels.length(); i++) {
            jewels.add(jewels[i]);
        }

        for (int i = 0; i < stones.length(); i++) {
            char currentChar = stones[i];
            if (jewelsSet.contains(currentChar)) {
                result++;
            }
        }

        return result;
    }
}