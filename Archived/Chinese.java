public class Chinese{
	public static void main(String... args){
		System.out.println(String.format("file.encoding: %s", System.getProperty("file.encoding")));
	// System.out.println(String.format("defaultCharset: %s", Charset.defaultCharset().name()));
		String test1="我是中国人";
		System.out.println(test1);
	}
}