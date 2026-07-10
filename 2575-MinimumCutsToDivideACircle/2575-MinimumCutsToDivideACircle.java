// Last updated: 7/10/2026, 11:54:05 AM
class Solution {
    public int numberOfCuts(int n) {
        if (n<=1){
            return 0;
        }if(n%2==0){
            return n/2;
        }else{
            return n;
        }
        
    }
}