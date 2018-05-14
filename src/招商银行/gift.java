package ’–…Ã“¯––;

import java.util.Scanner;

public class gift {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int[] person = new int[N];
		if(K <= 0||N<=0||M<=0||K>N){
			System.out.println(0);
			return;
		}
		for(int i = 0;i<M;i++){
			Add(person,K-1);
		}
		System.out.println(person[K-1]);
	}

	public static void Add(int[] person, int k) {
		// TODO Auto-generated method stub
		 if (k - 1 >= 0 && person[k] > person[k - 1]) {
	            Add(person, k - 1);
	        } else if (k + 1 < person.length && person[k] > person[k + 1]) {
	            Add(person, k + 1);
	        } else {
	            person[k]++;
	        }
	}
}
