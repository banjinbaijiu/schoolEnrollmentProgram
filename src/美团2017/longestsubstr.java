package √¿Õ≈2017;

import java.util.Scanner;

public class longestsubstr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			System.out.println(helper(s1,s2));
		}
	}
	public static int helper(String s1,String s2){
		int l1 = s1.length();
		int l2 = s2.length();
		int max = 0;
		int[][] dp = new int[l1+1][l2+1];
		for(int i=1;i<=l1;i++){
			for(int j=1;j<=l2;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1]+1;
				}else{
					dp[i][j] = 0;
				}
				max = Math.max(dp[i][j], max);
			}
		}
		return max;
	}
}
