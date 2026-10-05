class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String> st=new Stack<>();

        for(char c: s.toCharArray()){
            System.out.print("st="+st+", c="+c);
            if(st.isEmpty() || c=='('){
                st.push(""+c);
            }else{
                String prev=st.peek();
            System.out.print(", prev="+prev);
                
                if(prev.equals("(")){
                    st.pop();
                    st.push("1");
            System.out.print(", st="+st);
                }else{
                    int score=Integer.parseInt(st.pop())*2;
                    st.pop();
                    st.push(""+score);
            System.out.print(", st="+st);
                }
            }

            int score=0;
            while(!st.isEmpty() && !st.peek().equals("(")){
                score+=Integer.parseInt(st.pop());
            }
            if(score>0)
            st.push(""+score);
            System.out.println(", st="+st);
            
            System.out.println("**");
        }
        return Integer.parseInt(st.pop());
    }
}