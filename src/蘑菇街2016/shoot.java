package 蘑菇街2016;

import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 有一个投篮游戏。球场有p个篮筐，编号为0，1...，p-1。
 * 每个篮筐下有个袋子，每个袋子最多装一个篮球。有n个篮球，每个球编号xi 。
 * 规则是将数字为xi 的篮球投到xi 除p的余数为编号的袋里。
 * 若袋里已有篮球则球弹出游戏结束输出i，否则重复至所有球都投完。输出-1。
 * 问游戏最终的输出是什么？
 */
public class shoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int p = sc.nextInt(); //篮筐数
			int n = sc.nextInt(); //篮球数
			int[] x = new int[n]; //记录篮球上的数字
			for(int i=0;i<n;i++){
				x[i] = sc.nextInt();
			}
			int[] book = new int[p]; //记录篮袋里是否已有篮球
			int index = -1;
			for(int i = 0;i<n;i++){
				if(book[x[i]%p]==1){
					index = i+1;
					break;
				}else{
					book[x[i]%p]=1;
				}
			}
			System.out.println(index);
		}
	}
}
