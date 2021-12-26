package easy;

public class $1967 {
    public int numOfStrings(String[] patterns, String word) {
        int result=0;

        for(int i=0; i<patterns.length; i++){
            for(int j=0; j<word.length(); j++){

                if(word.substring(j).startsWith(patterns[i])){
                    result++;
                    break;
                }

            }
        }

        return result;
    }
}
