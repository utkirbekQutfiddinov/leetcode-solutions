package solutions;

public class $2103 {
    public int countPoints(String rings) {
        boolean[] haveRed=new boolean[10];
        boolean[] haveGreen=new boolean[10];
        boolean[] haveBlue=new boolean[10];
        int rod=0;
        for(int i=0; i<rings.length()-1; i++){
            rod=(int)rings.charAt(i+1)-48;
            if(rings.charAt(i)=='R') haveRed[rod]=true;
            if(rings.charAt(i)=='G') haveGreen[rod]=true;
            if(rings.charAt(i)=='B') haveBlue[rod]=true;
        }

        int res=0;
        for(byte i=0; i<10; i++){
            if(haveRed[i]&&haveGreen[i]&&haveBlue[i]) res++;
        }
        return res;
    }
}
