class Solution {
    public int countSegments(String s) {
        String[] segs=s.split(" +");
        return (int)Arrays.stream(segs).map(a->a.trim()).filter(b->b.length()>0).count();
}
}