package Accessspecifier;

public class Sort1 {

	public static void main(String[] args) {
		int []arr= {5,6,7,1,0,3};
		System.out.println(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println(arr);
	}

}
