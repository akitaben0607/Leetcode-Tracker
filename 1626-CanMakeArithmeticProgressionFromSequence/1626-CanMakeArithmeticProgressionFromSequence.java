// Last updated: 7/10/2026, 11:54:39 AM
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]!=diff) return false;
        }
        return true;
    }
}