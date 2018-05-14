package 今日头条2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
/**
 * 
 * @author 陈奎
 * 有 n 个字符串，每个字符串都是由 A-J 的大写字符构成。
 * 现在你将每个字符映射为一个 0-9 的数字，不同字符映射为不同的数字。
 * 这样每个字符串就可以看做一个整数，唯一的要求是这些整数必须是正整数且它们的字符串不能有前导零。
 * 现在问你怎样映射字符才能使得这些字符串表示的整数之和最大？
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
		long sum = 0; //返回的最大和
		HashMap<Character, Long> map = new HashMap<Character, Long>();
		ArrayList<Character> headList = new ArrayList<Character>();
		for(int i=0;i<n;i++){
			setWeight(strs[i],map,headList);
		}
		//按照各个字符放入权重进行排序
		ArrayList<Map.Entry<Character, Long>> list = new ArrayList<Map.Entry<Character, Long>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Long>>() {
			@Override
			public int compare(Entry<Character, Long> o1, Entry<Character, Long> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() > o2.getValue() ? -1 : 1; //根据字符的权重进行从大到小排序
			}
		});
		int number = 9; //最大的数字
		//除去头元素为0的情况，办法：将权重最小的且不是头元素的第一个字符放置在映射值为0的位置
		if(list.size()==10){
			for(int i = 9;i>=0;i--){
				if(!headList.contains(list.get(i).getKey())){// 满足权重最小的且不是头元素的第一个字符
					list.remove(i); // 去除就相当于放置在映射值为0的位置
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
	//设置每个字符串中每个字符的权重，并且保留首字符
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
