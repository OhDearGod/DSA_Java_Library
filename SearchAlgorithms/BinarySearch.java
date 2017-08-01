import java.io.*;
import java.math.BigInteger;
import java.util.*;


class BinarySearch{
	
	public static int BS(int[] Arr, int key, int low, int high){
		if(low>high)
			return -1;
		else{
			int mid=(low+high)/2;
			if(Arr[mid]==key)
				return mid;
			else if(mid>key)	
				return BS(Arr, key, low, mid-1);
			else //mid<key	
				return BS(Arr, key, mid+1, high);
		}	
	}
	
	public static int InbuiltBS(int[] Arr, int key){
		return Arrays.binarySearch(Arr, key);
	}
	
	/*public static void main(String[] args){
		
		Scanner S=new Scanner(System.in);
		int N=5;
		int[] A=new int[N];
		for(int i=0; i<5; i++){
			A[i]=S.nextInt();
		}
		
		int ind=BS(A, 1, 0, N-1);
		if(ind!=-1)
			System.out.println("Element Found : " + A[ind]);
		else
			System.out.println("Element not Found ");
		
	}*/
}
