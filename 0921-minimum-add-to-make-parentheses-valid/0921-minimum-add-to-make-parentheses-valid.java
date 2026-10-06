class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int res=0;
        for(char c: s.toCharArray()){
            if(st.isEmpty() || c=='('){
                st.push(c);
            }else if(c==')'){
                char peek=st.peek();
                if(peek=='('){
                    st.pop();
                }else{
                    res++;
                }
            }
        }
        res+=st.size();
        return res;
    }
}