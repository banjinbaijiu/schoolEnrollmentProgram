package ��Ѷ2016;
/**
 * 
 * @author �¿�
 * ��һ�����ı����У��������������ڵĴ���ֻ��һλ����������ͬ�� ������ֱ���Ϊ������(Gray Code)�����дһ��������ʹ�õݹ�ķ�������Nλ�ĸ����롣
 * ����һ������n���뷵��nλ�ĸ����룬˳��Ϊ��0��ʼ��
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
    	//�ݹ�ǰn-1�ĸ�����
    	String[] last = getGray(n-1);
    	//��������㷽ʽ��ǰһ�θ������������
    	//ǰ�벿�ֵĶ�������ǰ��0
    	//��벿�ֵĶ�������ǰ��1
    	for(int i = 0;i<last.length;i++){
    		gray[i] = "0" + last[i];
    		gray[gray.length-i-1] = "1" + last[i];
    	}
    	return gray;
    }
}
