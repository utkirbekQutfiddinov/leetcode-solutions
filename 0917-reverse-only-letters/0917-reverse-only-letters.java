class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int right=s.length()-1, left=0;
           char c=' ';
           while(true){
               while(!Character.isLetter(s.charAt(left)) && left<right){
                   left++;
               }
               
               if(left>=right) break;
               
               while(!Character.isLetter(s.charAt(right)) && left<right){
                   right--;
               }
               
               if(left>=right) break;
               
               c=chars[left];
               chars[left]=chars[right];
               chars[right]=c;
               left++;
               right--;
               
               if(left>=right) break;
           }
        return new String(chars);
    }
}