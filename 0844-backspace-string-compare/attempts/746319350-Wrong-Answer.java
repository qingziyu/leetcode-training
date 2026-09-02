class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sPointer = s.length() - 1;
        int tPointer = t.length() - 1;

        int sCount = 0;
        int tCount = 0;

        while(sPointer >= 0 && tPointer >= 0) {
            char currentSChar = s.charAt(sPointer);
            char currentTChar = t.charAt(tPointer);

            if (currentSChar == '#') {
                sCount++;
                sPointer--;
                continue;
            }

            if (currentTChar == '#') {
                tCount++;
                tPointer--;
                continue;
            }

            if (sCount > 0 && currentSChar != '#') {
                sCount--;
                sPointer--;
                continue;
            }

            if (tCount > 0 && currentTChar != '#') {
                tCount--;
                tPointer--;
                continue;
            }

            if (currentSChar == currentTChar) {
                sPointer--;
                tPointer--;
                continue;
            } else {
                return false;
            }
        }

        if (sPointer >= 0) {
            for (int i = sPointer; i < 0; i--) {
                char currentSChar = s.charAt(sPointer);
                if (currentSChar != '#') {
                    return false;
                }
            }
        }

        if (tPointer >= 0) {
            for (int i = tPointer; i < 0; i--) {
                char currentTChar = t.charAt(tPointer);
                if (currentTChar != '#') {
                    return false;
                }
            }
        }

        return true;
    }
}