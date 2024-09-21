class Solution {
    public List<Integer> lexicalOrder(int n) {
        TreeSet<String> s=new TreeSet<>();

        for(int i=1; i<=n; i++){
            s.add(String.valueOf(i));
        }

        return s.stream()
                .map(Integer::parseInt)
                .toList();
    }
}