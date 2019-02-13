public class SwitchTest{
	public static void main(String[] args){
		String season="summer";
		int count=0;
		while (count < 10){
		count++;
		switch (season){
			case "spring":
				System.out.println("warm");
				break;
			case "summer":
				System.out.println("hot");
				break;
			case "autumn":
				System.out.println("cool");
				break;
			case "winter":
				System.out.println("cold");
				break;
			default:
				System.out.println("wrong season type");
		}
	}
	}
}