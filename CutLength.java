/*
Total length is 4, and cut lengths are 2, 1 and 1. We can make maximum 4 segments each of length 1.

Input format:
First line of input contains of an integer T denoting number of test cases. First line of each test case contains N. Second line of each test
case contains 3 space separated integers x,y and z

Output format
For each answer test case print in a new line an integer corresponding to the answer.

Code constraints:
1<=t<=70
1<=N,x,y,z<=4000

Sample test cases:
input:
2
4
2 1 1
5
5 3 2

output:
4
2
*/

import java.util.*; 
class CutLength  
{ 
    static int maximumSegments(int n, int a, int b, int c) 
    { 
        int dp[] = new int[n + 10]; 
        Arrays.fill(dp, -1); 
        dp[0] = 0; 
        for (int i = 0; i < n; i++)  
        { 
            if (dp[i] != -1)  
            {  
                if(i + a <= n )    //avoid buffer overflow 
                dp[i + a] = Math.max(dp[i] + 1, dp[i + a]); 
                if(i + b <= n )    //avoid buffer overflow 
                dp[i + b] = Math.max(dp[i] + 1,   dp[i + b]); 
                if(i + c <= n )    //avoid buffer overflow 
                dp[i + c] = Math.max(dp[i] + 1, dp[i + c]); 
            } 
        } 
        return dp[n]; 
    } 
    public static void main(String arg[]) 
    { 
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	int a[]= new int[t];
    	for(int i=0;i<t;i++) {
	        int n = sc.nextInt();
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int z = sc.nextInt(); 
	        a[i]=maximumSegments(n, x,y,z); 
    	}
    	for(int i=0;i<t;i++) {
    		System.out.println(a[i]);
    	}
    	sc.close();
    } 
} 

