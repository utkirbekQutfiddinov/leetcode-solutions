package easy;

public class $1342 {
    public int numberOfSteps(int num) {
        int res=0;
        while(num!=0){
            if(num%2==0)num/=2;
            else num--;
            res++;
        }
        return res;
    }
}
