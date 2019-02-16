public class Person
{
	public String name;
	public String age;
	public void say(String content){
		System.out.println(name+" says: "+content);
	}
	public static void main(String[] args){
		Person p=new Person();
		p.name="Wayne";
		p.say("Hello Java!");
	}
}