class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] occs=new int[26];
        for(char c: text.toCharArray()){
            occs[c-'a']++;
        }
        //1: b, a, n
        //2: l, o
        return Math.min(
                    Math.min(
                        Math.min(
                            Math.min(occs['a'-'a']
                            ,occs['b'-'a'])
                        ,occs['n'-'a'])
                    ,occs['l'-'a']/2)
                ,occs['o'-'a']/2);

    }
}