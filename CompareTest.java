public class CompareTest
{
	public static void main(String[] args){
		Integer intObj1=11;
		Integer intObj2=11;
		System.out.println(intObj1==intObj2);
		Integer intObj3=1111;
		Integer intObj4=1111;
		
		System.out.println(intObj3==intObj4);
		System.out.println(Integer.compare(intObj3,intObj4));


	}
}