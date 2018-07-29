/*ArrayList
ArrayList<String> array=new ArrayList<String>();
�����������͵��б�
���û���������Ҫ��ȫ��,��Ӧ�Ķ�Ӧ����������
ArrayList can store indefinite number of reference type elements
	-add(Obj)
	-size()
	-get(int index)
	-remove(int index)
	-add(int index,obj)
	
*/
import java.util.ArrayList;
public class ArrayListDemo{
	public static void main(String[] args){
		//create container first
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello!");
		System.out.println("Size of array is: "+array.size());
		System.out.println(array.get(0));
		array.add("my");
		array.add("name");
		array.add("is");
		array.add("Wayne");
		for (int i=1;i<array.size();i++){
			System.out.println(array.get(i));
		}
	}
}