/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int leftPointer = 0;
        int rightPointer = n;

        while(leftPointer < rightPointer) {
            int midPointer = (rightPointer - leftPointer)/2 + leftPointer;

            if (isBadVersion(midPointer)) {
                rightPointer = midPointer;
            } else {
                leftPointer = midPointer;
            }
        }

        return leftPointer - 1;
    }
}