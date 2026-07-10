// Last updated: 7/10/2026, 11:53:30 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int last,sum=0;
        int ori=x;
        while(x!=0){
            last=x%10;
            sum+=last;
            x=x/10;
        }
        if (ori%sum==0) return sum;
        else return -1;
    }
}