package 吉比特2017;

import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 输入M、N，1 < M < N < 1000000，求区间[M,N]内的所有素数的个数。
 * 素数定义：除了1以外，只能被1和自己整除的自然数称为素数
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
