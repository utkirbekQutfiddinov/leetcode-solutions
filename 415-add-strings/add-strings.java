class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder katta, kichik;

        if(num1.length()>num2.length()){
            katta=new StringBuilder(num1);
            kichik=new StringBuilder(num2);
        }else {
            katta=new StringBuilder(num2);
            kichik=new StringBuilder(num1);
        }


        while((katta.length()!=kichik.length())){
            kichik.insert(0,'0');
        }


        int qoldiq=0;


        for(int i=katta.length()-1; i>=0; i--){
            qoldiq=qoldiq+katta.charAt(i)-'0'+kichik.charAt(i)-'0';

            katta.setCharAt(i,(char)(qoldiq%10+48));

            qoldiq=qoldiq/10;
        }

        if(qoldiq>0){
            katta.insert(0,'1');
        }

        return katta.toString();

    }
}