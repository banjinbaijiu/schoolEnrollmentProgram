package ����2017;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ������Ϸ����Ҹ������ӵĵ��������ߵĲ����������ӵ���Ϊ1ʱ������һ��������Ϊ2ʱ����������������Ϊnʱ������n����
 * ������ߵ���n����n<=�������������Ƿ�����Ψһ��Σ�ʱ���ܹ��ж�����Ͷ���ӵķ����� 
 */
public class dafuwong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println((int)Math.pow(2, n-1));
		}
	}	
}
