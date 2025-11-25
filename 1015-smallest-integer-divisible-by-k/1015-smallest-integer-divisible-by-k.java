class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0) return -1; 
        Set<Long> rems=new HashSet<>();
       long n=1;
        int len=1;
       while(n%k!=0){
        n=(n*10+1)%k;
        len++;
        if(rems.contains(n)){
            return -1;
        }
        rems.add(n);
       }
       return len;
    }
}