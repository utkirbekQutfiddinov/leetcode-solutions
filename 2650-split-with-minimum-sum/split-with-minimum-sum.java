class Solution {
    public int splitNum(int num) {
        int[] digits=new int[10];


        while(num!=0){
            digits[num%10]++;
            num/=10;
        }

        int num1=0, num2=0;
        int ind=1;
        boolean first=true;

        while(ind<10){
            if(digits[ind]>0){
                if(first){
                    num1=num1*10+ind;
                }else {
                    num2=num2*10+ind;
                }
                first=!first;
                digits[ind]--;
            }else {
                ind++;
            }
        }

        return num1+num2;
    }
}