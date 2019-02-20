class Apple{
	int weight;
	String name;
	public String toString(){
		return "Apple "+this.name+" "+this.weight;
	}
	public boolean equals(Apple b){
		return (this.weight==b.weight?true:false);
	}

}
public class EqualtoStringTest{
	public static void main(String[] args){
		Apple a=new Apple();
		Apple b=new Apple();
		a.weight=5;
		a.name="AAPL";
		b.weight=5;
		b.name="BBC";
		System.out.println(a);
		System.out.println(a.equals(b));
	}
}