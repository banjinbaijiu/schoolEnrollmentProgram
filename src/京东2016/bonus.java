package 京东2016;
/**
 * 
 * @author 陈奎
 * 小东所在公司要发年终奖，而小东恰好获得了最高福利，他要在公司年会上参与一个抽奖游戏，游戏在一个6*6的棋盘上进行，上面放着36个价值不等的礼物，每个小的棋盘上面放置着一个礼物，他需要从左上角开始游戏，每次只能向下或者向右移动一步，到达右下角停止，一路上的格子里的礼物小东都能拿到，请设计一个算法使小东拿到价值最高的礼物。
 * 给定一个6*6的矩阵board，其中每个元素为对应格子的礼物价值,左上角为[0,0],请返回能获得的最大价值，保证每个礼物价值大于100小于1000。
 * 平面上有N＊M个格子，每个格子中放着一定数量的苹果。你从左上角的格子开始， 每一步只能向下走或是向右走，每次走到一个格子上就把格子里的苹果收集起来， 这样下去，你最多能收集到多少个苹果。
 * 解这个问题与解其它的DP问题几乎没有什么两样。第一步找到问题的“状态”， 第二步找到“状态转移方程”，然后基本上问题就解决了。
 * 首先，我们要找到这 个问题中的“状态”是什么？我们必须注意到的一点是， 到达一个格子的方式最多只有两种：从左边来的(除了第一列)和从上边来的(除了第一行)。 因此为了求出到达当前格子后最多能收集到多少个苹果， 我们就要先去考察那些能到达当前这个格子的格子，到达它们最多能收集到多少个苹果。 (是不是有点绕，但这句话的本质其实是DP的关键：欲求问题的解，先要去求子问题的解)
 * 经过上面的分析，很容易可以得出问题的状态和状态转移方程。 状态S[i][j]表示我们走到(i, j)这个格子时，最多能收集到多少个苹果。那么， 状态转移方程如下：
 * S[i][j]=A[i][j] + max(S[i-1][j], if i>0 ; S[i][j-1], if j>0)
 * 其中i代表行，j代表列，下标均从0开始；A[i][j]代表格子(i, j)处的苹果数量。
 * S[i][j]有两种计算方式：1.对于每一行，从左向右计算，然后从上到下逐行处理；2. 对于每一列，从上到下计算，然后从左向右逐列处理。 这样做的目的是为了在计算S[i][j]时，S[i-1][j]和S[i][j-1]都已经计算出来了。
 */
public class bonus {
	//基于动态规划的思想，不仅仅局限于6*6矩阵，适用于所有的N*M矩阵以及所有的方阵。
	public int getMost(int[][] board){
		for(int i = 0;i<board.length;i++){
			for(int j = 0;j <board[0].length;j++){
				if(i==0&&j!=0){
					//如果走在行的临界边，也就是第一行，那么他只能向右行走
					//行走的时候该点就要将后面的值加起来
					board[i][j] += board[i][j-1];
				}else if(i!=0&&j==0){
					//如果行走在列的临界边，也就是第一列，那么他只能向下走
					//向下走的时候该点就要将上面的值加起来。
					board[i][j] += board[i-1][j];
				}else if(i!=0&&j!=0){
					//核心点在这，除去两个临界边，剩下的就是既能向右走，也能向下走
					//那么这时候就要考虑走到当前点的所有可能的情况，也就是走到当前点
					//各自路径的和是不是这些所有到达该点路径当中最大的了。
					board[i][j] += Math.max(board[i-1][j], board[i][j-1]);
				}
			}
		}
		return board[board.length-1][board[0].length-1];
	}

}
