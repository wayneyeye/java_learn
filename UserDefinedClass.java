/*User Defined Class
	Defined class
	create another .java to contain
	format
		public class ClassName{
			fields;
			(like variable definitions)
			methods;
		}
*/
/*To Test the Cellphone Class*/
// import Cellphone
public class UserDefinedClass {
	public static void main(String[] args){
		Cellphone c1=new Cellphone();
		System.out.println(c1); //print the address
		c1.color="yellow";
		c1.brand="samsung";
		c1.size=15.67;
		System.out.println(c1.brand); //print the brand of the cellphone
		
	}
}