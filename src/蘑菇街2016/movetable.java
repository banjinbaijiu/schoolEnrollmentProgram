package Ģ����2016;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ������һ�Ű뾶Ϊr��Բ����������λ��(x,y)�����������Բ���������Ƶ�(x1,y1)��
 * ÿ���ƶ�һ������������Բ����Ե�̶�һ����Ȼ��Բ�����������ת����������Ҫ�ƶ�������
 */
public class movetable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int r = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			double len = Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2));
			System.out.println((int)Math.ceil(len)/(2*r));
		}
	}
}
