package Ä¢¹½½Ö2016;

import java.util.Scanner;

public class maximumInterval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num = sc.nextInt();
			int[] list = new int[num];
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int i=0;i<num;i++){
				list[i] = sc.nextInt();
			}
			for(int i=1;i<num;i++){
				max = Math.max(max, list[i]-list[i-1]);
			}
			for(int i=1;i<num-1;i++){
				min = Math.min(min, list[i+1]-list[i-1]);
			}
			System.out.println(max>min?max:min);
		}
	}
}
