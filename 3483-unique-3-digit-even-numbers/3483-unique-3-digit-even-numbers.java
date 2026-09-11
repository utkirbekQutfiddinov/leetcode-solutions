class Solution {
    public int totalNumbers(int[] digits) {
        if(digits.length<3) return 0;
        
         Set<Integer> nums=new HashSet<>();
         int son=0;
        
        for(int i=0; i<digits.length-2; i++){
            for(int j=i+1; j<digits.length-1; j++){
                for(int z=j+1; z<digits.length; z++){
                    //=1,j=2,z=3: 123, 132, 213, 231, 312, 321 
                    son=digits[i]*100+digits[j]*10+digits[z];
                    if(son>99 && son%2==0){
                    nums.add(son);
                    }
                    son=digits[i]*100+digits[j]*1+digits[z]*10;
                   if(son>99 && son%2==0){
                    nums.add(son);
                    }
                    son=digits[i]*10+digits[j]*100+digits[z];
                    if(son>99 && son%2==0){
                    nums.add(son);
                    }
                    son=digits[i]*1+digits[j]*100+digits[z]*10;
                   if(son>99 && son%2==0){
                    nums.add(son);
                    }
                    son=digits[i]*10+digits[j]+digits[z]*100;
                   if(son>99 && son%2==0){
                    nums.add(son);
                    }
                    son=digits[i]+digits[j]*10+digits[z]*100;
                    if(son>99 && son%2==0){
                    nums.add(son);
                    }
                }
            }
        }
        System.out.println(nums);
         return nums.size();
    }
}