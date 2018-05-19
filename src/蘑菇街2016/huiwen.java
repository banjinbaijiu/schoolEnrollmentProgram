package 蘑菇街2016;

import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 给定一个字符串，问是否能通过添加一个字母将其变为回文串。
 */
public class huiwen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			int end = s.length()-1;
			int start = 0;
			int check1 = 0; //正向添加
			int check2 = 0; //反向添加
			while(start<=end){
				if(s.charAt(start)==s.charAt(end)){
					start++;
					end--;
				}else{
					start++; //正向尝试判断有几处不同
					check1++;
				}
			}
			//后向前，前向后都遍历一次，然后取与为1表示可以转化为会问字符串
			start = 0;
			end = s.length()-1;
			while(start<=end){
				if(s.charAt(start)==s.charAt(end)){
					start++;
					end--;
				}else{
					end--; //后向尝试判断有几处不同
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
