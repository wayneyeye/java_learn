public class EnumTest
{
	public static void main(String[] args) throws Exception{
		Gender g1=Gender.MALE;
		System.out.println(g1.getName());
		byte[] b=g1.getName().getBytes();
		for (byte c:b){
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println(new String(b));
		System.out.println(new String(b,"gbk"));
	}
}