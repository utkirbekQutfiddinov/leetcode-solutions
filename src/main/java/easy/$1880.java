package easy;

public class $1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstSum=0, secondSum=0, targetSum=0, power=1;
        for(int i=firstWord.length()-1; i>=0; i--){
            firstSum+=((int)firstWord.charAt(i)-97)*power;
            power*=10;
        }
        power=1;
        for(int i=secondWord.length()-1;i>=0; i--){
            secondSum+=power*((int)secondWord.charAt(i)-97);
            power*=10;
        }
        power=1;
        for(int i=targetWord.length()-1; i>=0; i--){
            targetSum+=power*((int)targetWord.charAt(i)-97);
            power*=10;
        }
        return targetSum==(firstSum+secondSum);
    }
}
