class Solution {
    public boolean checkPerfectNumber(int num) {
         int res = 1;
 
    for (int i = 2; i * i <= num; i++)
    {
        if (num % i==0)
        {
            if(i * i != num)
                res += i + num / i;
            else
                res +=  i;
        }
    }
  return res == num && num != 1;
    }
}