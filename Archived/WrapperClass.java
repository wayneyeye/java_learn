public class WrapperClass{
	public static void main(String[] args){
		Integer intObj=5;
		Object o =false;
		if (o instanceof Boolean){
			// Wrong
			// Boolean bObj=o;
			Boolean bObj=(Boolean) o;
			boolean bBase=(Boolean) o;
			System.out.println(bObj);
			System.out.println(bBase);
		}
	}
}