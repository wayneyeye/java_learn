public class Banana extends Fruit{
	public Banana(String name,String color){
		super(name,color); //must appear in the first line of the constructor
	}
	public void info(){
		System.out.println("Banana says,");
		super.info();
	}
	public static void main(String[] args){
		// Banana b=new Banana("B","y",5.8); //constructor not inheritated
		Banana b=new Banana("B","y"); 
		b.info(); //call to an overiden methods
	}
}