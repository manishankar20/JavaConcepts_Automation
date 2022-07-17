package BasicPrograms;

import java.net.MulticastSocket;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		int arr[] = {2,2,5,3,3,4,5};
		int length = arr.length;
		
		length = removeDuplicates(arr, length);
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static int removeDuplicates(int arr[], int n) {
		if(n==0||n==1) {
			return n;
		}
		
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		
		temp[j++] = arr[n-1];
		for(int i=0;i<j;i++) {
			arr[i]= temp[i];
		}
		return j;
		
	}

}
