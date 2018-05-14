package 招商银行;

import java.util.Scanner;
/**
 * 
 * @author 陈奎
 * 按照卡中心校园招聘的要求，HR小招和小商需要从三个科室中（分别为A、B、C）抽派面试官去往不同城市。
 * 两名HR按照以下规定轮流从任一科室选择面试官：每次至少选择一位，至多选择该科室剩余面试官数。最先选不到面试官的HR需要自己出差。
 * 假设HR小招和小商都不想出差且每次选择都采取最优策略，如果是小招先选，写一个函数来判断她是否需要出差。如果不需要出差，请给出第一步的最优策略。
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
