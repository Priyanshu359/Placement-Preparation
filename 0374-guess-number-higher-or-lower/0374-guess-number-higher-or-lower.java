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
        int i = 1;
        while(i<=n) {
            int mid = i+(n-i)/2;
            int num = guess(mid);
            if(num == 0 ){
                return mid;
            }
            else if(num == -1) {
                n = mid-1;
            }
            else {
                i = mid+1;
            }
        }
        return -1;
    }
}