/*
Scanner is a predefined class by JavaCodebaseComponent
to create a reference type
classname varname=new classname()
eg.
Scanner sc = new Scanner()
scanner is to take input from stdin
########################################
Step 1
import package(s), use the correct path
	java-util-scanner
Step 2 
Create scanner class variable
Step 3
Use the variable

*/
import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args){
		//create Scanner variable
		Scanner sc = new Scanner(System.in);
		//to use the scanner class
		//nextInt() take an integer input from keyboad
		//exception will raise error
		// int i=sc.nextInt();
		// System.out.println(i);
		
		// take string input
		String str =sc.next();
		System.out.println(str);
		
	}
}