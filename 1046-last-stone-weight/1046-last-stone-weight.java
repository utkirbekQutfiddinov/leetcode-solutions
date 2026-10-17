class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }

        while (true) {
            int size = list.size();
            if (size == 0) {
                return 0;
            } else if (size == 1) {
                return list.get(0);
            } else {
                list.sort(Comparator.naturalOrder());
                int y = list.getLast();
                list.removeLast();
                int x = list.getLast();
                list.removeLast();
                if (x != y)
                    list.add(y - x);
            }
        }
    }
}