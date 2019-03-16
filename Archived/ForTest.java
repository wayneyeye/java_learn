public class ForTest{
	public static void main(String[] args){
		// test for the normal for loop
		for (int i=1;i<=5;i++){
			System.out.println(i);
		}
		// test for putting the iterator outside the for loop 
		int j =1;
		for (;j<=10;j++){
			System.out.println(j);
		}
		System.out.println(j);

	}
}