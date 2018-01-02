package com.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 12, 23, 34, 45, 56, 67, 77, 89, 90 };
		System.out.println(binSearch(arr, 22));
	}
	
	public static int binSearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(arr[mid] < key) {
				low = mid + 1;
			}else if(arr[mid] > key) {
				high = mid - 1;
			}else {
				System.out.println("找到了，索引为" + mid);
				return mid;
			}
		}
		System.out.println("没找到！！！");
		return -1;

	}

}
