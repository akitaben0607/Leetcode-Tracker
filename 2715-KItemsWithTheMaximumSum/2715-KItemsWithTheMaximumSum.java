// Last updated: 7/10/2026, 11:53:53 AM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;
        else if (k<=(numOnes+numZeros)) return numOnes;
        else{
            int rem=k-(numOnes+numZeros);
            return numOnes-rem;
        }
    }
}