package ∞Æ∆Ê“’;

import java.util.Scanner;

public class segmentingline {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			int ans = Integer.MAX_VALUE;
			for(int i = 0;i<s.length();i++){
				int r = 0;
				for(int j=0;j<i;j++){
					if(s.charAt(j)!='R'){
						r++;
					}
				}
				for(int k=i;k<s.length();k++){
					if(s.charAt(k)!='G'){
						r++;
					}
				}
				ans = Math.min(ans, r);
			}	
			System.out.println(ans);
		}		
	}
}
