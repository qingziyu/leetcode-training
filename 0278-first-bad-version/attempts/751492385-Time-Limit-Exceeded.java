/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int leftPointer = 1;
        int rightPointer = n;

        while(leftPointer <= rightPointer) {
            int midPointer= (rightPointer - leftPointer)/2 +leftPointer;
            
            if(isBadVersion(midPointer)) {
                rightPointer = midPointer;
            } else {
                leftPointer = midPointer + 1;
            }
        }

        return leftPointer;
    }
}