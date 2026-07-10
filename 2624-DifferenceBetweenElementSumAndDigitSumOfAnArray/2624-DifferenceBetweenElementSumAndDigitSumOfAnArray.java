// Last updated: 7/10/2026, 11:54:01 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int last,sum1=0,sum2=0;
        for(int x:nums){
            sum1+=x;
            int ori=x;
            while(ori!=0){
                last=ori%10;
                sum2+=last;
                ori/=10;
            }

        }
        return sum1-sum2;
    }
}