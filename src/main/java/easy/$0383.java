package easy;

public class $0383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rN=new int[123];
        int[] m=new int[123];

        for(int i=0; i<ransomNote.length(); i++){
            rN[((int)ransomNote.charAt(i)-48)]++;
        }

        for(int i=0; i<magazine.length(); i++){
            m[((int)magazine.charAt(i)-48)]++;
        }

        for(byte i=0; i<123; i++){
            if(m[i]<rN[i]) return false;
        }

        return true;
    }
}
