class Solution {
    public boolean isTrionic(int[] nums) {
        boolean searchingForP=true, searchingForQ=false, checking=false;
        int p=1,q=2;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                System.out.print("nums["+i+"]>nums["+(i-1)+"]. ");
                if(searchingForP){
                    System.out.println(" p ni izlayapmiz, davom etamiz!");
                    //do nothing
                }else if(searchingForQ){
                    System.out.println(" q ni izlayapmiz, demak q ni topdik, tekshiruvni boshlaymiz!");
                    q=i-1;
                    searchingForQ=false;
                    checking=true;
                }else{
                    System.out.println(" tekshiryapmiz, davom etamiz!");
                    //do nothing
                }
            }else if(nums[i]<nums[i-1]){
                System.out.print("nums["+i+"]<nums["+(i-1)+"]. ");
                if(searchingForP){
                    if(i==1) return false;
                    System.out.println(" p ni izlayapmiz, demak p ni topdik, q ni izlashni boshlaymiz!");
                    p=i-1;
                    searchingForP=false;
                    searchingForQ=true;
                }else if(searchingForQ){
                    System.out.println(" q ni izlayapmiz, davom etamiz!");
                    //do nothing
                }else{
                    System.out.println(" tekshiryotgan edik, natija false!");
                    return false;
                }
            }else {
                System.out.print("nums["+i+"]=nums["+(i-1)+"]. Natija false!");
                return false;
            }
        }
        return checking;
    }
}