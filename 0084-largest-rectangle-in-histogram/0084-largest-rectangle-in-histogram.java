class Solution {
    public int largestRectangleArea(int[] heights) {
        int res = 0, index = -1;
        int[] stack = new int[heights.length + 1];

        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];

            while (index > -1 && h < heights[stack[index]]) {
                int height = heights[stack[index--]]; // pop and get height
                int width = (index == -1) ? i : i - stack[index] - 1;
                res = Math.max(res, height * width);
            }
            stack[++index] = i;
        }
        return res;
    }
}