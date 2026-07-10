// Last updated: 7/10/2026, 11:54:55 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int last,sum=0;
        int prod=1;
        
        while(n!=0){
            last=n%10;
            sum+=last;
            prod*=last;
            n=n/10;
        }
        return prod-sum;
    }
}