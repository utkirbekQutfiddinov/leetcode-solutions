class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String> st=new Stack<>();

        for(char c: s.toCharArray()){
            if(st.isEmpty() || c=='('){
                st.push(""+c);
            }else{
                String prev=st.peek();
                
                if(prev.equals("(")){
                    st.pop();
                    st.push("1");
                }else{
                    int score=Integer.parseInt(st.pop())*2;
                    st.pop();
                    st.push(""+score);
                }
            }

            int score=0;
            while(!st.isEmpty() && !st.peek().equals("(")){
                score+=Integer.parseInt(st.pop());
            }
            if(score>0)
            st.push(""+score);
            
        }
        return Integer.parseInt(st.pop());
    }
}