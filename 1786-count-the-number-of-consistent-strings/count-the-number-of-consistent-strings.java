class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();

        for(char c: allowed.toCharArray()){
            set.add(c);
        }

        int count=0;
        boolean ok=false;

        for(int i=0; i<words.length; i++){
            ok=true;
            for(int j=0; j<words[i].length(); j++){
                if(!set.contains(words[i].charAt(j))){
                    ok=false;
                    break;
                }
            }

            if(ok){
                count++;
            }
        }

        return count;
    }
}