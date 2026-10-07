class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int removeClose=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                st.push(c);
            }else if(c==')'){
                if(st.isEmpty()){
                    removeClose++;
                }else{
                    st.pop();
                }
            }
        }
        int removeOpen=st.size();
        Set<String> result=new HashSet<>();
        validate(s, 0, removeOpen, removeClose, result);

        return result.stream().toList();
    }

    private void validate(String str, int from, int open, int close, Set<String> result){
        if(open==0 && close==0 && isValid(str)) {
            result.add(str);
            return;
        }

        if(from>=str.length()) return;

        char c=str.charAt(from);

        if(open>0 && c=='('){
            validate(str.substring(0,from)+str.substring(from+1), from, open-1, close, result);
        }

        if(close>0 && c==')'){
            validate(str.substring(0,from)+str.substring(from+1), from, open, close-1, result);
        }
        validate(str, from+1, open, close, result);
    }

    private boolean isValid(String s){
        Stack<Character> st=new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='('){
                st.push(c);
            }else if(c==')'){
                if(st.isEmpty()) return false;
                else st.pop();
            }
        }
        return st.isEmpty();
    }
}