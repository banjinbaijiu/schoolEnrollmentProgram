package ����ͷ��2017;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ���� x, k �������� x + y = x | y �ĵ� k С�������� y ��
 * | �Ƕ����ƵĻ�(or)���㣬���� 3 | 5 = 7��
 * ���統 x=5��k=1ʱ���� 2����Ϊ5+1=6 ������ 5|1=5���� 5+2=7 ���� 5 | 2 = 7��
 */
public class digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long x = sc.nextLong();
			long k = sc.nextLong();
			long bitNum = 1; //ָ��x�ĵ�ǰλ
			long ans = 0; //y�ĸ�λ��ֵ�ۼӣ��ۼ���ϵõ�y
			while(k>0){
				if((x & bitNum) == 0){ //�����ǰxλΪ0
					ans +=(bitNum*(k & 1)); //��k�����һλȡ����������x��Ӧ��Ϊ���λ���ۼ���һλ��ֵ
					k = k >> 1; //kȡ�����һλ����������һλ
				}
				//��������x�ĵ�ǰλΪ0��1,bitNum��������һλ
                bitNum = bitNum << 1;
			}
			System.out.println(ans); //������ans������y��ֵ��
		}
	}
}
