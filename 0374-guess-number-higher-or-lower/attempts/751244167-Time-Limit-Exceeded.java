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
        int resultNum = (leftPointer + rightPointer)/2;

        while(true) {
            resultNum = (leftPointer + rightPointer)/2;
            int result = guess(resultNum);

            if (result == 0) {
                return resultNum;
            } if (result == -1) {
                rightPointer = rightPointer - 1;
            } else {
                leftPointer = leftPointer + 1;
            }
        }
    }
}