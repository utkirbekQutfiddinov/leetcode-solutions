class Solution {
    public int minimumSwaps(int[] nums) {
        int l=0, r=nums.length-1;
        int res=0;
        while(true){
            while(l<r && nums[l]!=0){
                l++;
            }
            System.out.print("l="+l);
            while(r>l && nums[r]==0){
                r--;
            }
            System.out.print(", r="+r);
            if(l<r){
                res++;
                l++;
                r--;
            }else{
                break;
            }
            
            System.out.println(", res="+res);
        }
        return res;
    }
}