public class ArrayTest1{
	public static void main(String[] args){
		// static init
		String[] str0;
		str0=new String[]{"abc","def"};
		// simplified static init
		String[] str1={"abc","def"};
		// dynamic init
		int len=3;
		String[] str2=new String[len];  // use system allocated init values (null for String)
		// use the foreach loop (since java 5) to iterate thru the arrays
		for (String s:str2){
			System.out.println(s);
		}
	}	
}