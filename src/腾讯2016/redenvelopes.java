package ��Ѷ2016;

/**
 * 
 * @author �¿�
 * �����ڼ�С��ʹ��΢���յ��ܶ��������ǳ����ġ��ڲ鿴��ȡ�����¼ʱ���֣�ĳ����������ֵĴ��������˺��������һ�롣
 * ���С���ҵ��ú����д�������㷨˼·�ʹ���ʵ�֣�Ҫ���㷨�����ܸ�Ч��
 * ����һ������Ľ������gifts�����Ĵ�Сn���뷵���������Ľ���û�н���������һ�룬����0��
 */
public class redenvelopes {
    public int getValue(int[] gifts, int n) {
        // write code here
    	int s = 1;
    	int a = gifts[0];
    	for(int i=1;i<n;i++){
    		if(gifts[i]==a){
    			s++;    			
    		}else{
    			s--;
    			if(s==0){
    				s = 1;
    				a = gifts[i];
    			}
    		}
    	}
    	int t = 0;
    	for(int i = 0;i<n;i++){
    		if(gifts[i]==a){
    			t++;
    		}
    	}
    	if(t*2>=n){
    		return a;
    	}else{
    		return 0;
    	}
    }
}
