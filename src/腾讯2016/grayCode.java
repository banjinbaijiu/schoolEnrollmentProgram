package 腾讯2016;
/**
 * 
 * @author 陈奎
 * 在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
 * 给定一个整数n，请返回n位的格雷码，顺序为从0开始。
 */
public class grayCode {
    public String[] getGray(int n) {
        // write code here
    	String[] gray = new String[(int) Math.pow(2,n)];
    	if(n==1){
    		gray[0] = "0";
    		gray[1] = "1";
    		return gray;
    	}
    	//递归前n-1的格雷码
    	String[] last = getGray(n-1);
    	//格雷码计算方式，前一次格雷码分两部分
    	//前半部分的二进制码前加0
    	//后半部分的二进制码前加1
    	for(int i = 0;i<last.length;i++){
    		gray[i] = "0" + last[i];
    		gray[gray.length-i-1] = "1" + last[i];
    	}
    	return gray;
    }
}
