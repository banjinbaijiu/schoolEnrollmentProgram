package ������;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ţţ�������������������Լ��ķɻ����������ǽ��м��������ķ��С�f[i]��ʾ��i�η��������ȼ�͵�������
 * ����ֻ�ܰ���f������������˳����С�
 * ����ɻ�����s��ȼ��,Ϊ����������,ÿ�η���ǰ�ɻ���ȼ����Ӧ���ڵ��ڴ˴���������Ҫ��ȼ������
 * ��������Ǽ����ڲ����м��͵�����������ܽ��еķ��д����� 
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
