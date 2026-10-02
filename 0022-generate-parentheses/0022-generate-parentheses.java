class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        handle(res,new StringBuilder(), n, 0, 0);
        return res;
    }

    private void handle(List<String> res, StringBuilder curr, int n, int open, int close){
        if(curr.length()==2*n) {
            res.add(curr.toString());
            return;
        }
        if(open<n){
            curr.append('(');
            handle(res, curr, n, open+1, close);
            curr.deleteCharAt(curr.length()-1);
        }

        if(close<open){
            curr.append(')');
            handle(res, curr, n, open, close+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}