/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int leftPointer = 0;
        int rightPointer = n;
        int midpoint = (leftPointer + rightPointer)/2;

        while(true) {
            midpoint = (rightPointer - leftPointer)/2 + leftPointer;
            int result = guess(midpoint);

            if (result == 0) {
                return midpoint;
            } if (result == -1) {
                rightPointer = midpoint - 1;
            } else {
                leftPointer = midpoint + 1;
            }
        }
    }
}