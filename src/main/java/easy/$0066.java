package easy;

public class $0066 {
    public int[] plusOne(int[] digits) {
        boolean add=true;
        int rem=1, sum=0;
        for(int i=0; i<(digits.length); i++)
            add=add&&(digits[i]==9);

        if(add){
            int[] res=new int[digits.length+1];
            for(int i=(digits.length-1);i>=0; i--){
                sum=digits[i]+rem;
                res[i+1]=sum%10;
                rem=sum/10;
            }
            res[0]=1;
            return res;
        } else {
            for(int i=(digits.length-1);i>=0; i--){
                sum=rem+digits[i];
                digits[i]=sum%10;
                rem=sum/10;
            }
            return digits;
        }
    }
}
