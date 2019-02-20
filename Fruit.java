public class Fruit{
	public String name;
	public String color;
	public double weight;
	public Fruit(String name,String color){
		this.name=name;
		this.color=color;
	}
	public Fruit(String name,String color,double weight){
		// use this() to reuse the constructor
		this(name,color);
		this.weight=weight;
	}
	public void info(){
		System.out.println("Name:"+this.name);
		System.out.println("Color:"+this.color);
		System.out.println("Weight:"+this.weight);
	}
}