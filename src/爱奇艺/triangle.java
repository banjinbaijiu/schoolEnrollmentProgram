package ������;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ţţ����������ľ��,���ȷֱ���a,b,c��
 * ţţ���԰���һһ��ľ����������,ţţ��Ŀ������������ľ������һ��������,����ţţ��ϣ����������ε��ܳ�Խ��Խ�á�
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
