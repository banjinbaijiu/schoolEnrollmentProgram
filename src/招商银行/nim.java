package ��������;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ���տ�����У԰��Ƹ��Ҫ��HRС�к�С����Ҫ�����������У��ֱ�ΪA��B��C���������Թ�ȥ����ͬ���С�
 * ����HR�������¹涨��������һ����ѡ�����Թ٣�ÿ������ѡ��һλ������ѡ��ÿ���ʣ�����Թ���������ѡ�������Թٵ�HR��Ҫ�Լ����
 * ����HRС�к�С�̶����������ÿ��ѡ�񶼲�ȡ���Ų��ԣ������С����ѡ��дһ���������ж����Ƿ���Ҫ����������Ҫ����������һ�������Ų��ԡ�
 */
public class nim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] inp = input.split(",");
		int a = Integer.valueOf(inp[0]);
		int b = Integer.valueOf(inp[1]);
		int c = Integer.valueOf(inp[2]);
		if((a^b^c) == 0){
			System.out.println(1);
			return;
		}else if(a>(b^c)){
			System.out.println("A,"+(a-(b^c)));
		}else if(b > (a^c)){
			System.out.println("B,"+(b-(a^c)));
		}else if(c > (a^b)){
			System.out.println("C,"+(c-(a^b)));
		}
	}
}
