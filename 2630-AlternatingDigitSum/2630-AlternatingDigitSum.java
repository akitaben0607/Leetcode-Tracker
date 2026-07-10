// Last updated: 7/10/2026, 11:53:59 AM
class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int sum=0;
        int sum2=0;
        for( int i=0; i<s.length(); i++){
            int dig=s.charAt(i)-'0';
            if(i%2==0){
                sum+=dig;
            }
            else 
                sum2+=dig;
        }
        return (sum-sum2);
    }
}