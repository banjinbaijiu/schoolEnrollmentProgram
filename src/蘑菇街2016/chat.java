package 蘑菇街2016;

import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * A和B是好友，他们经常在空闲时间聊天，A的空闲时间为[a1 ,b1 ],[a2 ,b2 ]..[ap ,bp ]。
 * B的空闲时间是[c1 +t,d1 +t]..[cq +t,dq +t],这里t为B的起床时间。
 * 这些时间包括了边界点。B的起床时间为[l,r]的一个时刻。
 * 若一个起床时间能使两人在任一时刻聊天，那么这个时间就是合适的，问有多少个合适的起床时间？
 */
public class chat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int result = 0;
			int p = sc.nextInt();
			int q = sc.nextInt();
			int l = sc.nextInt();
			int r = sc.nextInt();
			int[] a = new int[p];
			int[] b = new int[p];
			int[] c = new int[q];
			int[] d = new int[q];
			for(int i = 0;i < p;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			for(int i = 0;i < q;i++){
				c[i] = sc.nextInt();
				d[i] = sc.nextInt();
			}
			for(int i = l;i<=r;i++){
				if(isProperTime(a,b,c,d,i)){
					result++;
				}
			}
			System.out.println(result);
		}
	}

	public static boolean isProperTime(int[] a, int[] b, int[] c, int[] d, int delay) {
		// TODO Auto-generated method stub
		int i = 0, j = 0, p = a.length,q = c.length;
		while(i<p && j<q){
			if(c[j]+delay<b[i] && d[j]+delay>a[i]){
				return true;
			}else if(c[j]+delay>=b[i]){
				i++;
			}else{
				j++;
			}
		}
		return false;
	}
}
