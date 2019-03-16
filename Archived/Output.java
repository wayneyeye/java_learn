public interface Output
{
	int MAX_CACHE_LINE=50; //can only have constant as member fields in the interface (final)
	void out(); //
	void getData(String msg);
	default void print(String... msgs){
		for(String msg:msgs){
			System.out.println(msg);
		}
	}
	default void test(){
		System.out.println("default test()!");
	}
	static String staticTest()
	{
		return "static method in the interface Output";
	} 
	private void foo(){ //utitlity introduced in java 9
		System.out.println("private foo method");
	}
	private static void bar(){
		System.out.println("private static bar method");
	}
}