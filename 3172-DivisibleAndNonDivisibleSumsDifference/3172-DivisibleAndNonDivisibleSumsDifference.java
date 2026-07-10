// Last updated: 7/10/2026, 11:53:32 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int s1=0;
        int s2=0;
        for (int i=1; i<=n; i++){
            if(i%m!=0){
                s1+=i;
            }else{
                s2+=i;
            }

        }
        return s1-s2;
    }
}