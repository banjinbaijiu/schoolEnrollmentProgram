package 蘑菇街2016;

import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 现在有一张半径为r的圆桌，其中心位于(x,y)，现在他想把圆桌的中心移到(x1,y1)。
 * 每次移动一步，都必须在圆桌边缘固定一个点然后将圆桌绕这个点旋转。问最少需要移动几步。
 */
public class movetable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int r = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			double len = Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2));
			System.out.println((int)Math.ceil(len)/(2*r));
		}
	}
}
