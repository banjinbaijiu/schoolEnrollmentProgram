package 美团2017;

import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 给定一组非负整数组成的数组h，代表一组柱状图的高度，其中每个柱子的宽度都为1。 在这组柱状图中找到能组成的最大矩形的面积（如图所示）。 
 * 入参h为一个整型数组，代表每个柱子的高度，返回面积的值。
 */
public class largestarea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println(helper(arr,0,arr.length-1));
		}
		sc.close();
	}
	public static int helper(int[] ar,int start,int end){
		int temp = start;
		int min = ar[start];
		for(int i=start;i<=end;i++){
			if(ar[i]<min){
				min = ar[i];
				temp = i;
			}
		}
		int maxArea = min*(end-start+1);
		int leftArea = 0;
		int rightArea = 0;
		if(temp!=start){
			leftArea = helper(ar,start,temp-1);
		}
		if(temp!=end){
			rightArea = helper(ar, temp+1, end);
		}
		return Math.max(maxArea, Math.max(leftArea, rightArea));
	}
}
