class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sPointer = s.length() - 1;
        int tPointer = t.length() - 1;

        while (sPointer >= 0 && tPointer >=0) {
            sPointer = findNextNumber(s, sPointer);
            tPointer = findNextNumber(t, tPointer);

            char currentSChar = s.charAt(sPointer);
            char currentTChar = t.charAt(tPointer);

            if (currentSChar != currentTChar) {
                return false;
            }

            sPointer--;
            tPointer--;
        }

        if (sPointer < 0) {
            tPointer =  findNextNumber(t, tPointer);

            if (tPointer < 0) {
                return false;
            }
        } else {
            sPointer =  findNextNumber(s, sPointer);

            if (sPointer < 0) {
                return false;
            }
        }

        return true;
    }

    private int findNextNumber(String s, int pointer) {
        int count = 0;
        while (pointer >= 0) {
            char currentChar = s.charAt(pointer);

            if (currentChar == '#') {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                return currentChar;
            }
        }

        return -1;
    }
}