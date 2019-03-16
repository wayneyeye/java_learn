/*
Demo for variables use in java
	- initialize
	- scope of variables
*/
public class Demo_var2{
	public static void main(String[] args){
		int i;
		i=5;
		System.out.println(i);
		{
			int i2=12312;
			//i2 can only be refered in side the brackets
		}
	}
}