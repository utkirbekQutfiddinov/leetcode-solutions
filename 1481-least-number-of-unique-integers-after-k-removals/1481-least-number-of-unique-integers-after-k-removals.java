class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
      Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort(Comparator.comparingInt(Map.Entry::getValue));

        int uniqueCount = frequencyMap.size();
        int removedCount = 0;

        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            int frequency = entry.getValue();
            if (k >= frequency) {
                k -= frequency;
                removedCount++;
            } else {
                break;
            }
        }

        return uniqueCount - removedCount;
    }
}