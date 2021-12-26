package easy;

public class $0026 {
    public static int removeDuplicates(int[] nums) {
        int removed=0;
        for(int i=0; i<nums.length-1-removed; i++){

            if(nums[i]==nums[i+1]){

                removed++;

                for(int j=i; j<(nums.length-removed); j++){
                    nums[j]=nums[j+1];
                }

                nums[nums.length-removed]=0;
            }
        }

        for(int i=nums.length-removed-1; i>0; i--){
            if(nums[i]==nums[i-1]){
                removed++;
                for(int j=i; j<(nums.length-removed); j++){
                    nums[j]=nums[j+1];
                }
                nums[nums.length-removed]=0;

            }
        }
        return (nums.length-removed);
    }
}
