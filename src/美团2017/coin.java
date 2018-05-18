package ����2017;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ����������� 1��5��10��20��50��100 Ԫ��ֽ�ң�
 * ����ÿ�ֱ�ֵ���������㹻�࣬��д���������NԪ��NΪ0~10000�ķǸ��������Ĳ�ͬ��ϵĸ�����
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
