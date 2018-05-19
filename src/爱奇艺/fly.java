package 爱奇艺;

import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 牛牛有羊羊有了属于他们自己的飞机。于是他们进行几次连续的飞行。f[i]表示第i次飞行所需的燃油的升数。
 * 飞行只能按照f数组所描述的顺序进行。
 * 起初飞机里有s升燃油,为了正常飞行,每次飞行前飞机内燃油量应大于等于此处飞行所需要的燃油量。
 * 请帮助他们计算在不进行加油的情况下他们能进行的飞行次数。 
 */
public class fly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int s = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			int result = 0;
			for(int i=0;i<n;i++){
				result += a[i];
				if(result>s){
					System.out.println(i);
					break;
				}else if(result==s||i==n-1){
					System.out.println(i+1);
					break;
				}
			}
			
		}
	}
}
