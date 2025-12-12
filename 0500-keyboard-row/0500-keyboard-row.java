class Solution {
    public String[] findWords(String[] words) {
        String topRow="qwertyuiop",midRow="asdfghjkl",bottomRow="zxcvbnm";
        Set<Character> topSet=new HashSet<>(), midSet=new HashSet<>(), bottomSet=new HashSet<>();

        for(char c: topRow.toCharArray()){
            topSet.add(c);
        }
        for(char c: midRow.toCharArray()){
            midSet.add(c);
        }
        for(char c: bottomRow.toCharArray()){
            bottomSet.add(c);
        }

        List<String> result=new ArrayList<>();

        char[] chars;
        boolean canBeTyped;
        for(String word: words){
            canBeTyped=false;
            chars=word.toLowerCase().toCharArray();
            if(topSet.contains(chars[0])){
                canBeTyped=true;
                for(char c: chars){
                    if(!topSet.contains(c)){
                        canBeTyped=false;
                        break;
                    }
                }
                if(canBeTyped){
                    result.add(word);
                    continue;
                }
            }
            if(midSet.contains(chars[0])){
                canBeTyped=true;
                for(char c: chars){
                    if(!midSet.contains(c)){
                        canBeTyped=false;
                        break;
                    }
                }
                if(canBeTyped){
                    result.add(word);
                    continue;
                }
            }
            if(bottomSet.contains(chars[0])){
                canBeTyped=true;
                for(char c: chars){
                    if(!bottomSet.contains(c)){
                        canBeTyped=false;
                        break;
                    }
                }
                if(canBeTyped){
                    result.add(word);
                    continue;
                }
            }
        }

        return result.toArray(new String[0]);
    }
}