class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();

        for(char c: s.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            } else if(c=='B' && st.peek()=='A' || c=='D' && st.peek()=='C'){
                st.pop();
            }else {
                st.push(c);
            }
        }

        return st.size();
    }
}