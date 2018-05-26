package 吉比特2017;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 给定一个未排序的数列，找到此数列在已排序状态下的两个相邻值的最大差值，少于两个值时返回0。例如：给定数列 [1,3,2,0,1,6,8] 则 最大差值为3。
 * 注意：请尽量使用时间复杂度为O(n)的方案。 
 */
public class maximumdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] m = new int[n];
		for(int i=0;i<n;i++){
			if(sc.hasNext()){
				m[i] = sc.nextInt();
			}
		}
		Arrays.sort(m);
		int result = 0;
		if(n<2){
			System.out.println(result);
		}
		for(int i = 0;i<n-1;i++){
			int temp = m[i+1]-m[i];
			if(temp>result){
				result = temp;
			}
		}
		System.out.println(result);
	}

}
