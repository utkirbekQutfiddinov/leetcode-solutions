class Solution {
    public String reverseByType(String s) {
        char[] chars=s.toCharArray();
        int left=0, right=chars.length-1;
        String special="!@#$%^&*()";

        while(true){
            while(left<right && (chars[left]<'a' || chars[left]>'z')){
                left++;
            }

            if(left>=right){
                break;
            }

            while(left<right && (chars[right]<'a' || chars[right]>'z')){
                right--;
            }

            if(left>=right){
                break;
            }

            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }

        left=0;
        right=chars.length-1;
        
        while(true){
            while(left<right && special.indexOf(chars[left])<0){
                left++;
            }

            if(left>=right){
                break;
            }

            while(left<right && special.indexOf(chars[right])<0){
                right--;
            }

            if(left>=right){
                break;
            }

            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}