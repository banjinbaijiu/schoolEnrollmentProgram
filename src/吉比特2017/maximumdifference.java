package ������2017;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ����һ��δ��������У��ҵ���������������״̬�µ���������ֵ������ֵ����������ֵʱ����0�����磺�������� [1,3,2,0,1,6,8] �� ����ֵΪ3��
 * ע�⣺�뾡��ʹ��ʱ�临�Ӷ�ΪO(n)�ķ����� 
 */
public class maximumdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] m = new int[n];
		for(int i=0;i<n;i++){
			if(sc.hasNext()){
				m[i] = sc.nextInt();
			}
		}
		Arrays.sort(m);
		int result = 0;
		if(n<2){
			System.out.println(result);
		}
		for(int i = 0;i<n-1;i++){
			int temp = m[i+1]-m[i];
			if(temp>result){
				result = temp;
			}
		}
		System.out.println(result);
	}

}
