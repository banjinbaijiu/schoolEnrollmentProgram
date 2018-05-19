package °®ÆæÒÕ;

import java.util.Scanner;

public class dyeing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			char[] cha = str.toCharArray();
			int t=0;
			for(int i = cha.length-1;i>=0;i--){
				if(cha[i]=='R'){
					t++;
				}else if(cha[i]=='G'){
					break;
				}
			}
			int result = t;
			for(int j = 0;j<cha.length-1-t;j++){
				if(cha[j]=='G'){
					result++;
				}
			}
			System.out.println(result);
		}
	}
}
