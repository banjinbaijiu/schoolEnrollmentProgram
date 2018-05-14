package ����ͷ��2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ��һ���ɺܶ�ľ�����ɵļ��ϣ�ÿ��ľ���ж�Ӧ�ĳ��ȣ������ܷ��ü����е���Щľ����
 * ĳ��˳����β��������һ��������� 0 �ļ򵥶����������ľ����Ҫ���ϣ��򵥶���μ������Խ��Ķ���Ρ�
 * ��ʼ�����ǿյģ������ֲ�����Ҫô���������һ������Ϊ L ��ľ����Ҫôɾȥ�������Ѿ��е�ĳ��ľ����
 * ÿ�β����������㶼��Ҫ��֪�Ƿ����ü����е���Щľ������һ���򵥶���Ρ�
 */
public class stick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			long[][] data = new long[n][2];
			for(int i=0;i<n;i++){
				data[i][0] = sc.nextLong();
				data[i][1] = sc.nextLong();
			}
			dealWith(data);
		}
	}

	public static void dealWith(long[][] data) {
		// TODO Auto-generated method stub
		ArrayList<Long> sticks = new ArrayList<Long>();
		for(int i=0;i<data.length;i++){
			if(data[i][0]==1){
				sticks.add(data[i][1]);
			}else{
				sticks.remove(data[i][1]);
			}
			judge(sticks);
		}
	}

	public static void judge(ArrayList<Long> sticks) {
		// TODO Auto-generated method stub
		if(sticks.size()<3){
			System.out.println("No");
		}else{
			Collections.sort(sticks);
			long sum = 0;
			for(int i=0;i<sticks.size()-1;i++){
				sum += sticks.get(i);				
			}
			if(sum>sticks.get(sticks.size()-1)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}
