class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> leftParentheses = new Stack<>();
        Stack<Integer> asterisks = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                leftParentheses.push(i);
            } else if (ch == '*') {
                asterisks.push(i);
            } else if (ch == ')') {
                if (!leftParentheses.isEmpty()) {
                    leftParentheses.pop();
                } else if (!asterisks.isEmpty()) {
                    asterisks.pop();
                } else {
                    return false;
                }
            }
        }

        while (!leftParentheses.isEmpty()) {
            if (asterisks.isEmpty() || leftParentheses.pop() > asterisks.pop()) {
                return false;
            }
        }

        return true;
    }
}