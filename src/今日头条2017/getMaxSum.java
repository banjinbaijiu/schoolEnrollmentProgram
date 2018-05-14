package ����ͷ��2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
/**
 * 
 * @author �¿�
 * �� n ���ַ�����ÿ���ַ��������� A-J �Ĵ�д�ַ����ɡ�
 * �����㽫ÿ���ַ�ӳ��Ϊһ�� 0-9 �����֣���ͬ�ַ�ӳ��Ϊ��ͬ�����֡�
 * ����ÿ���ַ����Ϳ��Կ���һ��������Ψһ��Ҫ������Щ���������������������ǵ��ַ���������ǰ���㡣
 * ������������ӳ���ַ�����ʹ����Щ�ַ�����ʾ������֮�����
 */
public class getMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			String[] strs = new String[n];
			for(int i=0;i<n;i++){
				strs[i] = sc.next();
			}
			System.out.println(maxSum(n,strs));
		}
	}
	public static long maxSum(int n,String[] strs){
		long sum = 0; //���ص�����
		HashMap<Character, Long> map = new HashMap<Character, Long>();
		ArrayList<Character> headList = new ArrayList<Character>();
		for(int i=0;i<n;i++){
			setWeight(strs[i],map,headList);
		}
		//���ո����ַ�����Ȩ�ؽ�������
		ArrayList<Map.Entry<Character, Long>> list = new ArrayList<Map.Entry<Character, Long>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Long>>() {
			@Override
			public int compare(Entry<Character, Long> o1, Entry<Character, Long> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() > o2.getValue() ? -1 : 1; //�����ַ���Ȩ�ؽ��дӴ�С����
			}
		});
		int number = 9; //��������
		//��ȥͷԪ��Ϊ0��������취����Ȩ����С���Ҳ���ͷԪ�صĵ�һ���ַ�������ӳ��ֵΪ0��λ��
		if(list.size()==10){
			for(int i = 9;i>=0;i--){
				if(!headList.contains(list.get(i).getKey())){// ����Ȩ����С���Ҳ���ͷԪ�صĵ�һ���ַ�
					list.remove(i); // ȥ�����൱�ڷ�����ӳ��ֵΪ0��λ��
					break;
				}
			}
		}
		for(Entry<Character, Long> entry : list){
			sum += entry.getValue() * number;
			number--;
		}
		return sum;
	}
	//����ÿ���ַ�����ÿ���ַ���Ȩ�أ����ұ������ַ�
	public static void setWeight(String string, HashMap<Character, Long> map, ArrayList<Character> headList) {
		// TODO Auto-generated method stub
		char[] cs = string.toCharArray();
		long init = 1;
		for(int i = cs.length-1;i>=0;i--){
			if(map.containsKey(cs[i])){
				map.put(cs[i], map.get(cs[i])+init);
			}else{
				map.put(cs[i], init);
			}
			init *= 10;
		}
		headList.add(cs[0]);
	}
	

}
