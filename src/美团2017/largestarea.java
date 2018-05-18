package ����2017;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ����һ��Ǹ�������ɵ�����h������һ����״ͼ�ĸ߶ȣ�����ÿ�����ӵĿ�ȶ�Ϊ1�� ��������״ͼ���ҵ�����ɵ������ε��������ͼ��ʾ���� 
 * ���hΪһ���������飬����ÿ�����ӵĸ߶ȣ����������ֵ��
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
