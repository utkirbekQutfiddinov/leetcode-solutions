class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        handle(res,new StringBuilder(), n);
        return res;
    }

    private void handle(List<String> res, StringBuilder curr, int n){
        if(curr.length()==2*n) {
            if(isVPS(curr)) res.add(curr.toString());
            return;
        }
        curr.append('(');
        handle(res, curr, n);
        curr.deleteCharAt(curr.length()-1);
        curr.append(')');
        handle(res, curr, n);
        curr.deleteCharAt(curr.length()-1);
    }

    private boolean isVPS(StringBuilder sb){
        Stack<Character> stack=new Stack<>();

        for(int i=0; i<sb.length(); i++){

            if(sb.charAt(i)=='(' ||stack.isEmpty()) {
                stack.push(sb.charAt(i));
            } else {
                char c=stack.pop();
                if(c=='(') {
                    continue;
                }else{
                    stack.push(')');
                    stack.push(')');
                }
            }
        }

        return stack.isEmpty();
    }
}