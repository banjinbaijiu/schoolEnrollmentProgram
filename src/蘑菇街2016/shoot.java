package Ģ����2016;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ��һ��Ͷ����Ϸ������p�����𣬱��Ϊ0��1...��p-1��
 * ÿ���������и����ӣ�ÿ���������װһ��������n������ÿ������xi ��
 * �����ǽ�����Ϊxi ������Ͷ��xi ��p������Ϊ��ŵĴ��
 * �����������������򵯳���Ϸ�������i�������ظ���������Ͷ�ꡣ���-1��
 * ����Ϸ���յ������ʲô��
 */
public class shoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int p = sc.nextInt(); //������
			int n = sc.nextInt(); //������
			int[] x = new int[n]; //��¼�����ϵ�����
			for(int i=0;i<n;i++){
				x[i] = sc.nextInt();
			}
			int[] book = new int[p]; //��¼�������Ƿ���������
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
