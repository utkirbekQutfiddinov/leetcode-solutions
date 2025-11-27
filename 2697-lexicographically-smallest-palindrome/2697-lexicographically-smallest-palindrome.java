class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars=s.toCharArray();

        int l=0, r=chars.length-1;

        while(l<r){
            if(chars[l]<chars[r]){
                chars[r]=chars[l];
            }else if(chars[l]>chars[r]){
                chars[l]=chars[r];
            }

            r--;
            l++;
        }

        return new String(chars);
    }
}