package 美团2017;

import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 给你六种面额 1、5、10、20、50、100 元的纸币，
 * 假设每种币值的数量都足够多，编写程序求组成N元（N为0~10000的非负整数）的不同组合的个数。
 *  
 */
public class coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(helper(n));
		}
	}
	public static long helper(int n){
		int[] coins = {1,5,10,20,50,100};
		long[] dp = new long[n+1];
		dp[0] = 1;
		for(int i = 0;i<6;i++){
			for(int j = coins[i];j<=n;j++){
				dp[j] += dp[j-coins[i]];
			}
		}
		return dp[n];
	}
}
