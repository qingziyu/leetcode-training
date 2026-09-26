class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternMap = new HashMap<Character, String>();
        Map<String, Character> reverseMap = new HashMap<String, Character>();
        int sPointer = 0;

        for (int i = 0; i < pattern.length(); i++) {
            if (sPointer >= s.length()) {
                return false;
            }

            char currentChar = pattern.charAt(i);
            int nextSpaceIndex = findNextSpace(s, sPointer);
            String sString = s.substring(sPointer, nextSpaceIndex);
            sPointer = nextSpaceIndex + 1;

            if (patternMap.containsKey(currentChar)) {
                if (!patternMap.get(currentChar).equals(sString)) {
                    return false;
                }
            }
            
            if (reverseMap.containsKey(sString)) {
                if (reverseMap.get(sString) != currentChar){
                    return false;
                }
            }
            
            patternMap.put(currentChar, sString);
            reverseMap.put(sString, currentChar);
        }

        if(sPointer != s.length() + 1){
            return false;
        }
        
        return true;
    }

    private int findNextSpace(String s, int pointer) {
        while(pointer < s.length() - 1) {
            pointer++;
            if (s.charAt(pointer) == ' ') {
                return pointer;
            }
        }

        return s.length();
    }
}