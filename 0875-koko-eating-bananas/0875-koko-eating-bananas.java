class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Arrays.stream(piles).max().getAsInt();
        int res = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long time = 0;
            for (int pile : piles) {
                time += (pile + mid - 1) / mid;
            }
            if (time <= h) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }
}