public class Apple{
	public String name;
	public String color;
	public double weight;
	public Apple(String name,String color){
		this.name=name;
		this.color=color;
	}
	public Apple(String name,String color,double weight){
		// use this() to reuse the constructor
		this(name,color);
		this.weight=weight;
	}
	public static void main(String[] args){
		Apple a=new Apple("A","g",12.5);
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.weight);
	}
}