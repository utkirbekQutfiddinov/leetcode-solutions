package solutions;

public class $1281 {
    public int subtractProductAndSum(int n) {
        int pro=1,sum=0;
        while(n!=0){
            pro*=n%10;
            sum+=n%10;
            n/=10;
        }
        return pro-sum;
    }
}
