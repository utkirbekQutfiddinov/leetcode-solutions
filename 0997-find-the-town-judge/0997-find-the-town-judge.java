class Solution {
   public int findJudge(int n, int[][] trust) {
        int[] trusters = new int[n + 1];
        int[] trusting = new int[n + 1];
        for (int[] a : trust) {
            trusting[a[0]]++;
            trusters[a[1]]++;
        }
        for (int i = 1; i <= n; ++i) {
            if (trusters[i] == n - 1 && trusting[i] == 0)
                return i;
        }
        return -1;
    }
}