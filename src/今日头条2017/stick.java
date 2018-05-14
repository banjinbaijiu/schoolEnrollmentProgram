package 今日头条2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 有一个由很多木棒构成的集合，每个木棒有对应的长度，请问能否用集合中的这些木棒以
 * 某个顺序首尾相连构成一个面积大于 0 的简单多边形且所有木棒都要用上，简单多边形即不会自交的多边形。
 * 初始集合是空的，有两种操作，要么给集合添加一个长度为 L 的木棒，要么删去集合中已经有的某个木棒。
 * 每次操作结束后你都需要告知是否能用集合中的这些木棒构成一个简单多边形。
 */
public class stick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			long[][] data = new long[n][2];
			for(int i=0;i<n;i++){
				data[i][0] = sc.nextLong();
				data[i][1] = sc.nextLong();
			}
			dealWith(data);
		}
	}

	public static void dealWith(long[][] data) {
		// TODO Auto-generated method stub
		ArrayList<Long> sticks = new ArrayList<Long>();
		for(int i=0;i<data.length;i++){
			if(data[i][0]==1){
				sticks.add(data[i][1]);
			}else{
				sticks.remove(data[i][1]);
			}
			judge(sticks);
		}
	}

	public static void judge(ArrayList<Long> sticks) {
		// TODO Auto-generated method stub
		if(sticks.size()<3){
			System.out.println("No");
		}else{
			Collections.sort(sticks);
			long sum = 0;
			for(int i=0;i<sticks.size()-1;i++){
				sum += sticks.get(i);				
			}
			if(sum>sticks.get(sticks.size()-1)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}
