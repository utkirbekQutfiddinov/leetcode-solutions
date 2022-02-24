package solutions;

public class $0058 {
        public int lengthOfLastWord(String s) {
            s.trim();
            String[] words=s.split(" ");
            return words[words.length-1].length();
        }
    }
