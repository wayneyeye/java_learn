public class OutputFieldTest{
	public static void main(String[] args){
		System.out.println(Output.MAX_CACHE_LINE);
		System.out.println(Output.staticTest());
		// Output.bar();
		Out.In in=new Out().new In("Test"); // can out put <-- from the same package
	}
}