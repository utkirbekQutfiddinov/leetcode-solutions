class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] s=new String[n];

        for(int i=0; i<n; i++){
            s[i]=String.valueOf(i+1);
        }

        Arrays.sort(s);

        List<Integer> l=new ArrayList<>();

        for(String num: s){
            l.add(Integer.parseInt(num));
        }

        return l;
    }
}