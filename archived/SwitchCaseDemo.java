/*
switch(statement){
	case 1:
		cmd;
		break;
	case 2:
		cmd;
		break;
	case 3:
		cmd;
		break;
	
	default:
		cmd;
		break;
}
*/
public class SwitchCaseDemo{
	public static void main(String[] arg){
		int i=1;
		switch(i){
			case 1:
			System.out.println("Monday");
			break; //if there is no break, will skip to the next case statement
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			case 7:
				System.out.println("Weekend!");
			default:
			System.out.println("Default Day");
			break;
		}
	}
}