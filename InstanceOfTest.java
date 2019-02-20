public class InstanceOfTest{
	static {
		System.out.println("static init...");
	}
	{
		System.out.println("instance init...");
	}
	public static void main(String[] args){
		String a="abc";
		Object b="Hello";
        new InstanceOfTest();
		System.out.println(a instanceof String);
		System.out.println(a instanceof Object);
		System.out.println(a instanceof String);
		System.out.println(b instanceof Object);
		System.out.println(b instanceof String);

	}
}