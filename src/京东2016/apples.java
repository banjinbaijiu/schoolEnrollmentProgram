package 京东2016;
/**
 * 
 * @author 陈奎
 * 果园里有一堆苹果，一共n头(n大于1小于9)熊来分，第一头为小东，它把苹果均分n份后，多出了一个，它扔掉了这一个，拿走了自己的一份苹果，接着第二头熊重复这一过程，即先均分n份，扔掉一个然后拿走一份，以此类推直到最后一头熊都是这样(最后一头熊扔掉后可以拿走0个，也算是n份均分)。问最初这堆苹果最少有多少个。
 * 给定一个整数n,表示熊的个数，返回最初的苹果数。保证有解。
 * 证明如下：
 * 假设，f(n),为第n个熊获得的苹果数量，则f(n-1)为第n-1个熊获得数量，则n*f(n)=(n-1)f(n-1)-1 =>nf(n)-(n-1)f(n-1)=-1;以此类推，得：nfn-f1=-(n-1) =>由题意可得，f1=(X-1)/n => X=n*n(fn+1)-n+1 因为 fn>=0,所以fn+1>=1,那么，fn+1取最小值，抛物线开口最大，等值x则其对应y值最小，=>fn=0 =>X=n*n-n+1.
 * 由公式X=n*n-n+1.当n=2时带入得：X=3；
 * 注： n*f(n)=(n-1)f(n-1)-1公式由 [n*f(n-1)-f(n-1)-1]/n=fn得到。证明完毕。
 * 
 */
public class apples {
	public int getInitial(int n){
		int a = (int) (Math.pow(n, n)-n+1);
		return a;
	}

}
