package 今日头条2017;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 给出 n 个字符串，对于每个 n 个排列 p，按排列给出的顺序(p[0] , p[1] … p[n-1])依次连接这 n 个字符串都能得到一个长度为这些字符串长度之和的字符串。
 * 所以按照这个方法一共可以生成 n! 个字符串。
 * 一个字符串的权值等于把这个字符串循环左移 i 次后得到的字符串仍和原字符串全等的数量，i 的取值为 [1 , 字符串长度]。
 * 求这些字符串最后生成的 n! 个字符串中权值为 K 的有多少个。
 * 注：定义把一个串循环左移 1 次等价于把这个串的第一个字符移动到最后一个字符的后面。
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

	//全排列
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
