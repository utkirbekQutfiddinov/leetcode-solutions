class Solution {
    public int largestInteger(int[] nums, int k) {

        int num1=nums[0], num2=nums[nums.length-1];
     Set<Integer> once=new HashSet<>(), twice=new HashSet<>();

        for(int num: nums){
            if(twice.contains(num)){
                continue;
            }else if (once.contains(num)){
                once.remove(num);
                twice.add(num);
            }else{
                once.add(num);
            }
        }

        if(k==1){
            int res=-1;

            for(int num: once){
                if(num>res){
                    res=num;
                }
            }
            return res;
            
        }else if (k<nums.length){

        Set<Integer> ff=new HashSet<>();
        if(once.contains(num1)){
            ff.add(num1);
        }
        if(once.contains(num2)){
            ff.add(num2);
        }

        int res=-1;
        for(int num: ff){
            if(num>res){
                res=num;
            }
        }
            return res;
        }else {
            int res=-1;

            for(int num: nums){
                if(num>res){
                    res=num;
                }
            }
            return res;
        }
    }
}