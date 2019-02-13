/*Array

define an array


*/
public class ArrayDemo{
	public static void main(String[] arg){
		int[] arr1=new int[1000]; //Allocate memory for storing the contents
		System.out.println(arr1);// the address of the array
		//use offset to call elements
		System.out.println(arr1[0]); // default element is 0
		System.out.println(arr1.length);
		int[] arr2=new int[]{1,2,3,4,5};//static declaration
		//enumerate the array
		for (int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		//2D array
		int[][] arr3=new int[3][4];//3 x 4
		int[][] arr4=new int[3][]; //not recommended
		int[][] arr5={{12,3,5},{7,6}};
		int[] arr_p;
		arr_p=arr2;
		System.out.println(arr_p[0]);
		
	}
}