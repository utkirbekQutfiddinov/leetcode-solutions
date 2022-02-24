package solutions;

public class $1974 {
    public int minTimeToType(String word) {
        char currentChar='a';
        int dist=0;
        int res=0;
        for(int i=0; i<word.length(); i++){

            //calculating distance between a char and current position
            dist=(int)word.charAt(i)-(int)currentChar;
            //current can be latest letters, so we get its absolute value
            if(dist<0) dist*=-1;

            //if dist is more than half way, we will move pointer counterClockWise
            if(dist>=13) res+=26-dist+1;
            else res+=dist+1;
            //finally, save pointers current position
            currentChar=word.charAt(i);
        }
        return res;
    }
}
