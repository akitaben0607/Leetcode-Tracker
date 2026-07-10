// Last updated: 7/10/2026, 11:53:11 AM
class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int ori=n;
        while(n!=0){
            int last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        return (Math.abs(ori-rev));
    }
}