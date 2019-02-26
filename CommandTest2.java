public class CommandTest2
{
	public static void main(String[] args){
		ProcessArray pa = new ProcessArray();
		int[] array={3,-4,6,6};
		pa.process(array, (target)->{
				int sum=0;
				for(int tmp : target){
					sum+=tmp;
				}
				System.out.println(sum);
			});
	}
}