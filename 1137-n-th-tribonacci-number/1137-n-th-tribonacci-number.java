class Solution {
    public int tribonacci(int n) {
        int []dp=new int[n+1];
        if(n==0 || n==1) return n;
        
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3; i<=n; i++){
            dp[i]=dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
}  
        // if(n==0){
        //     return 0;
        // }
        // if(n==1 || n==2){
        //     return 1;
        // }
        // int n1=0;
        // int n2=1;
        // int n3=1;
        // int k=0;
        // for(int i=3; i<=n; i++){
        //     k=n1+n2+n3;
        //     n1=n2;
        //     n2=n3;
        //     n3=k;
        // }
        // return k;
