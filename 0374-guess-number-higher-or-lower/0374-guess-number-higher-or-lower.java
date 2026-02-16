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
        int left=1, right=n;

        int res=-1, guess=0;

        do{
            guess=left+(right-left)/2;
            res=guess(guess);
            if(res<0){
                right=guess-1;
            }else if (res>0){
                left=guess+1;
            }
        }while(res!=0);

        return guess;
    }
}