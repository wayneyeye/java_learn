import java.util.Arrays;
public class ArrayTest3{
	public static void main(String[] args){
		int[] array_0=new int[5];
		// fill an array with values
		Arrays.fill(array_0,3);
		for(int i:array_0){
			System.out.print(i+" ");
		}
			System.out.println();
		// make a copy of an array
		int[] array_1=Arrays.copyOf(array_0,5);
		for(int i:array_1){
			System.out.print(i+" ");
		}
			System.out.println();
		// sort an array
		int[] array_2={4,2,1,3,5};
		Arrays.sort(array_2,1,4);
		// Arrays.sort(array_2);
		for(int i:array_2){
			System.out.print(i+" ");
		}
			System.out.println();
		System.out.println(Arrays.toString(array_2));
		// parallel
		int[] array_3={4,2,1,3,5};
		Arrays.parallelSort(array_3);
		// Arrays.sort(array_2);
		for(int i:array_3){
			System.out.print(i+" ");
		}
			System.out.println();
		System.out.println(Arrays.toString(array_3));
	}
}