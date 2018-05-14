package ����ͷ��2017;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author �¿�
 * ���� n ���ַ���������ÿ�� n ������ p�������и�����˳��(p[0] , p[1] �� p[n-1])���������� n ���ַ������ܵõ�һ������Ϊ��Щ�ַ�������֮�͵��ַ�����
 * ���԰����������һ���������� n! ���ַ�����
 * һ���ַ�����Ȩֵ���ڰ�����ַ���ѭ������ i �κ�õ����ַ����Ժ�ԭ�ַ���ȫ�ȵ�������i ��ȡֵΪ [1 , �ַ�������]��
 * ����Щ�ַ���������ɵ� n! ���ַ�����ȨֵΪ K ���ж��ٸ���
 * ע�������һ����ѭ������ 1 �εȼ��ڰ�������ĵ�һ���ַ��ƶ������һ���ַ��ĺ��档
 */
public class getNumWeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			String[] strs = new String[n];
			for(int i = 0; i < n; i++){
				strs[i]  = sc.next();
			}
			System.out.println(getNumWeightK(n,k,strs));
		}
	}

	public static int getNumWeightK(int n, int k, String[] strs) {
		// TODO Auto-generated method stub
		int count = 0;
		ArrayList<String> strings = new ArrayList<String>();
		permutation(strings,strs,0);
		for(int i = 0;i < strings.size(); i++){
			int weight = getWeight(strings.get(i));
			if(weight == k){
				count++;
			}
		}
		return count;
	}
	public static int getWeight(String string) {
		// TODO Auto-generated method stub
		int weight = 0;
		int len = string.length();
		for(int i = 0;i < len;i++){
			if(string.substring(0, i).equals(string.substring(len-i, len)) && string.substring(0, len-i).equals(string.substring(i, len))){
				weight++;
			}
		}
		return weight;
	}

	//ȫ����
	public static void permutation(ArrayList<String> strings, String[] strs, int k) {
		// TODO Auto-generated method stub
		if(k == strs.length){
			String temp = "";
			for(int i = 0;i < strs.length; i++){
				temp += strs[i];
			}
			strings.add(temp);
		}else{
			for(int i = k; i < strs.length; i++){
				swap(strs,i,k);
				permutation(strings, strs, k+1);
				swap(strs,i,k);
			}
		}
	}

	public static void swap(String[] strs, int i, int j) {
		// TODO Auto-generated method stub
		if(i!=j){
			String t = strs[i];
			strs[i] = strs[j];
			strs[j] = t;
		}
	}
}
