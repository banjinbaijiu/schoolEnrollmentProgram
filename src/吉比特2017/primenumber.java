package ������2017;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ����M��N��1 < M < N < 1000000��������[M,N]�ڵ����������ĸ�����
 * �������壺����1���⣬ֻ�ܱ�1���Լ���������Ȼ����Ϊ����
 */
public class primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
		for(int i = m;i<=n;i++){
			int j =2;
			for(j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					break;
				}				
			}
			if(j>Math.sqrt(i)){
				result++;
			}
		}
		System.out.println(result);
	}
}
