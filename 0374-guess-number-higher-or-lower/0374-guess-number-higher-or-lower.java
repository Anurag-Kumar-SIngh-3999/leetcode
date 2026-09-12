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
        int low=1;
        int high=n;

        while(low<=high){

            int mid = low + (high-low)/2;
            int result = guess(mid);
            if(result==0){  //guess is same 
                return mid;
            }
            else if(result==-1){  //guess is greater than picked
                high=mid-1;
            }
            else { //guess is smaller than picked 
                low=mid+1;
            }
        }
        return -1;
    }
}