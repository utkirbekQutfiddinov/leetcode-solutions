class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> ast = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                left.push(i);
            } else if (ch == '*') {
                ast.push(i);
            } else if (ch == ')') {
                if (!left.isEmpty()) {
                    left.pop();
                } else if (!ast.isEmpty()) {
                    ast.pop();
                } else {
                    return false;
                }
            }
        }

        while (!left.isEmpty()) {
            if (ast.isEmpty() || left.pop() > ast.pop()) {
                return false;
            }
        }

        return true;
    }
}