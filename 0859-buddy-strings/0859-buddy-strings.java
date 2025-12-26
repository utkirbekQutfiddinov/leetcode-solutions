class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }

        if(s.equals(goal)){
            Set<Character> set=new HashSet<>();

            for(char c: s.toCharArray()){
                set.add(c);
            }

            return set.size()!=s.length();
        }

        List<Integer> differences=new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=goal.charAt(i)){
                differences.add(i);
            }
        }

        return differences.size()==2 
                && s.charAt(differences.get(0))==goal.charAt(differences.get(1))
                && s.charAt(differences.get(1))==goal.charAt(differences.get(0));
    }
}