package Ģ����2016;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * A��B�Ǻ��ѣ����Ǿ����ڿ���ʱ�����죬A�Ŀ���ʱ��Ϊ[a1 ,b1 ],[a2 ,b2 ]..[ap ,bp ]��
 * B�Ŀ���ʱ����[c1 +t,d1 +t]..[cq +t,dq +t],����tΪB����ʱ�䡣
 * ��Щʱ������˱߽�㡣B����ʱ��Ϊ[l,r]��һ��ʱ�̡�
 * ��һ����ʱ����ʹ��������һʱ�����죬��ô���ʱ����Ǻ��ʵģ����ж��ٸ����ʵ���ʱ�䣿
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
