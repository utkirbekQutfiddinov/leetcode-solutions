class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int curr = 0, left = 0;
        do {
            curr += arr[left];
            left++;
        } while (left < arr.length && curr * 3 != sum);
        if (curr * 3 != sum)
            return false;

        curr = 0;
        int right = arr.length - 1;
        do {
            curr += arr[right];
            right--;
        } while (right >= 0 && curr * 3 != sum);

        if (curr * 3 != sum || left > right)
            return false;

        curr = 0;
        while (left <= right) {
            curr += arr[left];
            left++;
        }

        return curr * 3 == sum;
    }
}