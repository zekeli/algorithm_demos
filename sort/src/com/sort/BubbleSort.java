package com.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	/*
	 * ð������
	 * �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������  
	 * ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������  
	 * ������е�Ԫ���ظ����ϵĲ��裬�������һ����
	 * ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ� 
	 * @param numbers ��Ҫ�������������
	 */
	public static void bubbleSort(int[] numbers)
	{
	    int temp = 0;
	    int size = numbers.length;
	    for(int i = 0 ; i < size-1; i ++){
		    for(int j = 0 ;j < size-1-i ; j++)
		    {
		        if(numbers[j] > numbers[j+1]) //��������λ��
		        {  
			        temp = numbers[j];
			        numbers[j] = numbers[j+1];
			        numbers[j+1] = temp;
		        }
		    }
	    }
	}

}
