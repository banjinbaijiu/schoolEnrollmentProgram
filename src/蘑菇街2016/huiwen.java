package Ģ����2016;

import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ����һ���ַ��������Ƿ���ͨ�����һ����ĸ�����Ϊ���Ĵ���
 */
public class huiwen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			int end = s.length()-1;
			int start = 0;
			int check1 = 0; //�������
			int check2 = 0; //�������
			while(start<=end){
				if(s.charAt(start)==s.charAt(end)){
					start++;
					end--;
				}else{
					start++; //�������ж��м�����ͬ
					check1++;
				}
			}
			//����ǰ��ǰ��󶼱���һ�Σ�Ȼ��ȡ��Ϊ1��ʾ����ת��Ϊ�����ַ���
			start = 0;
			end = s.length()-1;
			while(start<=end){
				if(s.charAt(start)==s.charAt(end)){
					start++;
					end--;
				}else{
					end--; //�������ж��м�����ͬ
					check2++;
				}
			}
			if(check1<=1||check2<=1){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
