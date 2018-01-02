package com.sort;

/*1��j=m+1��k=i��i=i; //�������ӱ����ʼ�±꼰�����������ʼ�±�
2����i>m ��j>n��ת�� //����һ���ӱ��Ѻϲ��꣬�Ƚ�ѡȡ����
3��//ѡȡr[i]��r[j]��С�Ĵ��븨������rf
        ���r[i]<r[j]��rf[k]=r[i]�� i++�� k++�� ת��
        ����rf[k]=r[j]�� j++�� k++�� ת��
4��//����δ��������ӱ���Ԫ�ش���rf
        ���i<=m����r[i��m]����rf[k��n] //ǰһ�ӱ�ǿ�
        ���j<=n ,  ��r[j��n] ����rf[k��n] //��һ�ӱ�ǿ�
5���ϲ�������*/

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	/**
	 * �鲢����
	 * ���:�����������������ϣ������ϲ���һ���µ������ ���Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ������������
	 * ʱ�临�Ӷ�ΪO(nlogn)
	 * �ȶ�����ʽ
	 * @param nums ����������
	 * @return �����������
	 */
	public static int[] sort(int[] nums, int low, int high) {
	    int mid = (low + high) / 2;
	    if (low < high) {
	        // ���
	        sort(nums, low, mid);
	        // �ұ�
	        sort(nums, mid + 1, high);
	        // ���ҹ鲢
	        merge(nums, low, mid, high);
	    }
	    return nums;
	}

	/**
	 * ��������low��highλ�õ�����������
	 * @param nums ����������
	 * @param low ���ŵĿ�ʼλ��
	 * @param mid �����м�λ��
	 * @param high ���Ž���λ��
	 */
	public static void merge(int[] nums, int low, int mid, int high) {
	    int[] temp = new int[high - low + 1];
	    int i = low;// ��ָ��
	    int j = mid + 1;// ��ָ��
	    int k = 0;

	    // �ѽ�С�������Ƶ���������
	    while (i <= mid && j <= high) {
	        if (nums[i] < nums[j]) {
	            temp[k++] = nums[i++];
	        } else {
	            temp[k++] = nums[j++];
	        }
	    }

	    // �����ʣ�������������
	    while (i <= mid) {
	        temp[k++] = nums[i++];
	    }

	    // ���ұ߱�ʣ�������������
	    while (j <= high) {
	        temp[k++] = nums[j++];
	    }

	    // ���������е�������nums����
	    for (int k2 = 0; k2 < temp.length; k2++) {
	        nums[k2 + low] = temp[k2];
	    }
	}

}
