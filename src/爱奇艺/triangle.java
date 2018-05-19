package 爱奇艺;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 牛牛手中有三根木棍,长度分别是a,b,c。
 * 牛牛可以把任一一根木棍长度削短,牛牛的目标是让这三根木棍构成一个三角形,并且牛牛还希望这个三角形的周长越大越好。
 */
public class triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0;i < 3;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		while(a[0]+a[1]<=a[2]){
			a[2]--;
			Arrays.sort(a);
		}
		System.out.println(a[0]+a[1]+a[2]);
	}
}
