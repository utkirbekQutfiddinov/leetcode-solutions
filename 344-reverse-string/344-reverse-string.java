class Solution {
    public void reverseString(char[] s) {
        Stack<Character> my=new Stack<>();
        for(int i=0; i<s.length; i++)
            my.push(s[i]);
        for(int i=0; i<s.length; i++)
            s[i]=my.pop();
    }
}