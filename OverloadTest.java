import java.util.Arrays;
public class OverloadTest{
	public static void test(String msg){
		System.out.println("String:"+msg);
	}

	public static void test(String... msg){
		System.out.println("String Arrays:");
		System.out.println(Arrays.toString(msg));
	}

	public static void main(String[] args){
		test("string1");	
		test(new String[] {"a","b","c"});
		test("string1","string2");
	}
	
}