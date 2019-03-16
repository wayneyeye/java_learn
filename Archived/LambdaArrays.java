import java.util.Arrays;
public class LambdaArrays
{
	public static void main(String[] args)
	{
		String[] arr1={"java","fkava","fkit","ios","android"};
		Arrays.parallelSort(arr1,(o1,o2)->o1.length()-o2.length());
		System.out.println(Arrays.toString(arr1));
		int[] arr2={2, 1, 7, 8, 4, 5, 6, 9, 8, 7};
		Arrays.parallelPrefix(arr2,(left,right)->left*right);
		System.out.println(Arrays.toString(arr2));
		int[] arr3={2, 1, 7, 8, 4};
		Arrays.parallelSetAll(arr3,(o)->arr3[o]*arr3[o]);
		System.out.println(Arrays.toString(arr3));
	}
}