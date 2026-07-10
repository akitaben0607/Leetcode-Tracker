// Last updated: 7/10/2026, 11:55:19 AM
class Solution {
    public int jobScheduling(int[] s, int[] e, int[] p) {
         int n =s.length;
        int [][] arr=new int[n][3];
       
        for(int i=0; i<n; i++){
            arr[i][0]=s[i];
            arr[i][1]=e[i];
            arr[i][2]=p[i];
        }
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        int []dp=new int [n+1];
        dp[n]=0;
        Arrays.sort(s);
        for(int i=n-1; i>=0; i--){
            int curr=arr[i][2];
            int end=arr[i][1];
            int next=0;
            int ind=-1;
            for (int j = i + 1; j < n; j++) {
                if(end <=s[j]) {
                    ind=j;
                    break;
                }
            }if(ind!=-1) next=dp[ind];                
            int ans=curr+next;
            dp[i]=Math.max(ans,dp[i+1]);
            
        }
        return dp[0];
        
    }
}